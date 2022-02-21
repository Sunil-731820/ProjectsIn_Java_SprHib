package com.java.servet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginDbservlet
 */
public class LoginDbservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginDbservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		try {
			Connection con = ConnectionHelper.getConnection();
			String cmd = "select count(*) cnt from users1 where userName=? and passWord=?";
			PreparedStatement pst = con.prepareStatement(cmd);
			pst.setString(1,request.getParameter("userName"));
			pst.setString(2, request.getParameter("passWord"));
			ResultSet res = pst.executeQuery();
			res.next();
			int cnt = res.getInt("cnt");
			if(cnt==1) {
				RequestDispatcher disp = request.getRequestDispatcher("menu.html");
				disp.forward(request, response);
			}else {
				out.println("Invalid credential *******");
				RequestDispatcher disp = request.getRequestDispatcher("LoginDb.html");
				disp.include(request, response);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
