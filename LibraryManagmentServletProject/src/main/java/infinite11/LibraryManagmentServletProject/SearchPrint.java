package infinite11.LibraryManagmentServletProject;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SearchPrint
 */
public class SearchPrint extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchPrint() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		ServletContext sct = getServletContext();
		RequestDispatcher rd1 = sct.getRequestDispatcher("/UserAccount");
		rd1.include(request, response);
		PrintWriter out = response.getWriter();
		String searchtype = request.getParameter("searchtype");
		String searchvalue = request.getParameter("searchvalue");
		String sq1 ;
		try {
			Connection con = ConnectionHelper.getConnection();
			if(searchtype.equals("id")) {
				sq1 = "select *from Books where Id=?";
			}else if(searchtype.equals("bookname")) {
				sq1 = "select *from Books where Name=?";
			}else if(searchtype.equals("authorname")){
				sq1 = "select *from Books where Author=?";
			}else if(searchtype.equals("dept")) {
				sq1 = "select *from Books where Dept=?";
			}else {
				sq1 = "select *from Books where name !=? OR 1=1";
			}
			PreparedStatement pst = con.prepareStatement(sq1,
					ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			pst.setString(1, searchvalue);
			ResultSet res = pst.executeQuery();
			if(res.next()) {
				out.write("<br/>Select books to issue : <br/>");
				res.previous();				
			out.write("<html><head><meta http-equiv='Content-Type'" +
			" content='text/html; charset=ISO-8859-1'></head>"+
			"<body><form action='Issue'><table><tr>"+
			"<td>Id</td><td>Name</td><td>Author</td><td>Edition</td>" +
			"<td>Dept</td><td>ToralBooks</td><td>Select</td></tr>");
			while(res.next()) {
				int bid=res.getInt("Id");
				String bname = res.getString("Name");
				String bauthor = res.getString("Author");
				String bedition = res.getString("Edition");
				String bdept = res.getString("Dept");
				String btotal = res.getString("toralBooks");
				out.write("<td>"+bid+"</td><td>"+bname+"</td><td>"+bauthor+"</td>" +
						"<td>"+bedition+"</td><td>"+bdept+"</td><td>"+btotal+"</td>");
				if(Integer.parseInt(btotal)>0) {
					out.write("<td><input type='checkbox' name='bookid' value="+bid+"></td></tr>");		
				}else {
					out.write("<td><input type='checkbox' name='bookid' disabled='true' value="+bid+"></td></tr>");
				}
			}
			out.write("</table><br/><input type='submit' value='Issue Books' ></form></body></html>");
			
			}else {
				out.write("<html><head><meta http-equiv='Content-Type'" +
						" content='text/html; charset=ISO-8859-1'></head>" +
						"<body><form action='Search'>" +
						"Sorry !... <br/> No book found for the Search Criteria<br/><br/>" +
						"<input type='submit' value='Return'></form></body></html>");
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
