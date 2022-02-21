package com.java.serv;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmployeeInsertServlet
 */
public class EmployeeInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeInsertServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	PrintWriter out = response.getWriter();
	try {
		Connection con = ConnectionHelper.getConnection();
		String cmd = "Insert into Employ(empno,name,gender,dept,desig,basic)"+
		"values(?,?,?,?,?,?)";
		PreparedStatement pst = con.prepareStatement(cmd);
		pst.setInt(1,Integer.parseInt(request.getParameter("empno")));
		pst.setString(2, request.getParameter("name"));
		pst.setString(3, request.getParameter("Gender"));
		pst.setString(4, request.getParameter("dept"));
		pst.setString(5, request.getParameter("desig"));
		pst.setInt(6,Integer.parseInt(request.getParameter("basic")));
		pst.executeUpdate();
		out.println("****Records Are Added IN the Table********");
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
