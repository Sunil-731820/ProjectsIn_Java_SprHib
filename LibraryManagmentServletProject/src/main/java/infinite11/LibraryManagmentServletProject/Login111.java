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
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Login111
 */
public class Login111 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login111() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String username1 =null;
		String password1 = null;
		ServletContext sct = getServletContext();
		try {
			Connection cp = ConnectionHelper.getConnection();
			String sq1 = "select Username , Password from LibUsers"+
			"where Username=? and Password=?";
			PreparedStatement pst = cp.prepareStatement(sq1);
			pst.setString(1, username);
			pst.setString(2, password);
			ResultSet res = pst.executeQuery();
			while(res.next()) {
				username1 = res.getString("UserName");
				password1 = res.getString("Password");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(username.equals(username1)&& password.equals(password1)) {
			HttpSession session = request.getSession(true);
			String sessionid = session.getId();
			sct.setAttribute("Sessionid", sessionid);
			sct.setAttribute("Username ", username);
			RequestDispatcher rd = sct.getRequestDispatcher("/UserAccount");
			rd.forward(request, response);
			
		}else {
			out.write("sorry!.....Username or Password is Incorrect.<br/>");
			out.write("Again Insert the username and password.");
			RequestDispatcher rd=sct.getRequestDispatcher("/login.html");
			rd.include(request, response);
			
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
