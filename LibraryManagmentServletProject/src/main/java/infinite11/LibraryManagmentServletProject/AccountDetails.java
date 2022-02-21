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
 * Servlet implementation class AccountDetails
 */
public class AccountDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AccountDetails() {
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
	RequestDispatcher rd1 = sct.getRequestDispatcher("/UserAccount");
	rd1.include(request, response);
	String username = (String) sct.getAttribute("Username");
	out.write("<pre><br/><br/><h4>Username : "+username+"<br/><br/>Type     : user</h4></pre>");
	out.write("Currently issued books :<br/><br/>");
	try {
		Connection cp = ConnectionHelper.getConnection();
		String sq1 = "select *from TranBook where username=?";
		PreparedStatement pst = cp.prepareStatement(sq1,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
		pst.setString(1, username);
		ResultSet res = pst.executeQuery();
		if(res.next()) {
			res.previous();
			out.write("<html><head><meta http-equiv='Content-Type'" +
					" content='text/html; charset=ISO-8859-1'></head>"+
					"<body><table><tr><td>BookId</td><td>Fromdate</td></tr>");
			while(res.next()) {
				int bookid = res.getInt("BookId");
				Date fromdate = res.getDate("Fromdate");
				out.write("<td>"+bookid+"</td><td>"+fromdate+"</td></tr>");
			}
			out.write("</table></body></html>");
		}else {
			out.write("----------------");
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
