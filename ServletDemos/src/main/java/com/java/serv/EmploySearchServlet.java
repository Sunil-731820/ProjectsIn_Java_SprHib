package com.java.serv;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmploySearchServlet
 */
public class EmploySearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmploySearchServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		try {
			Connection con = ConnectionHelper.getConnection();
			String cmd = "Select *from employ where Empno=?";
			PreparedStatement pst = con.prepareStatement(cmd);
			pst.setInt(1, Integer.parseInt(request.getParameter("Empno")));
			ResultSet res = pst.executeQuery();
			if(res.next()) {
				out.println("Employe name is " + res.getString("name") + "<br>");
				out.println("Gender is " + res.getString("Gender") + "<br>");
				out.println("Department is " + res.getString("Dept")+"<br>");
				out.println("the designation is " + res.getString("Desig")+"<br>");
				out.println("The Basic is " + res.getInt("Basic")+"<br>");
			}else {
				out.println("*****************the Records does not Exits ********");
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
