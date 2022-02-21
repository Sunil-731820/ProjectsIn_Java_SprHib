package infinite11.LibraryManagmentServletProject;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Return
 */
public class Return extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Return() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		ServletContext sct = getServletContext();
		String username = (String) sct.getAttribute("Username");
		RequestDispatcher rd1 = sct.getRequestDispatcher("/UserAccount");
		rd1.include(request, response);
		String sq1 = null;
		Connection con;
		try {
			con = ConnectionHelper.getConnection();
			sq1 = "select *from tranBook where Username=?";
			PreparedStatement pst = con.prepareStatement(sq1);
			pst.setString(1, username);
			ResultSet res = pst.executeQuery();
			int i=0;
			if(res.next()) {
				out.write("<br/><br/>Select which book you want to return :");
				res.previous();				
				out.write("<html><head><meta http-equiv='Content-Type'" +
				" content='text/html; charset=ISO-8859-1'></head>"+
				"<body><form action='ReturnNext'><table><tr>"+
				"<td>BookId</td><td>Fromdate</td><td>Select</td></tr>");
				while(res.next()) {
					int bookid = res.getInt("BookId");
					Date fromdate = res.getDate("Fromdate");
					out.write("<td>"+bookid+"</td><td>"+fromdate+"</td>" +
							"<td><input type='checkbox' name='bookid' value="+bookid+"></td></tr>");		
							i++;
				}
				out.write("</table><br/><input type='submit' value='Return Books' ></form></body></html>");
			}
			if(i==0) {
				out.write("<br> No more to be return available");
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
