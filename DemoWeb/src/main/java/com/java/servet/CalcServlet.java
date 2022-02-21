package com.java.servet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalcServlet
 */
public class CalcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalcServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		int firstNo , secondNo,result;
		response.setContentType("text/html");
		firstNo = Integer.parseInt(request.getParameter("firstNo"));
		secondNo = Integer.parseInt(request.getParameter("secondNo"));
		result = firstNo + secondNo;
		out.println("The Sum of the Two Number is "  +result + "<br>");
		result = firstNo - secondNo;
		out.println("The Subtraction of the two number is " + result + "<br>");
		result = firstNo * secondNo;
		out.println("the Multiplication of the two number is " + result + "<br>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
