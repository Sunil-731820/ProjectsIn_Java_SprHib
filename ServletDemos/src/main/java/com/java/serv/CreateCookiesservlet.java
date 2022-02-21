package com.java.serv;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class CreateCookiesservlet
 */
public class CreateCookiesservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateCookiesservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		this is the first cookie
		Cookie firstOne = new Cookie("Arti", "90");
		firstOne.setMaxAge(1000*60*60*24);
		response.addCookie(firstOne);
		
//		this is the second cookies 
		Cookie secondOne = new Cookie("suman", "100");
		secondOne.setMaxAge(1000*60*60*24);
		response.addCookie(secondOne);
		
//		this is the third cookies
		
		Cookie thirdOne = new Cookie("subham", "97");
		thirdOne.setMaxAge(1000*60*60*24);
		response.addCookie(thirdOne);
		

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
