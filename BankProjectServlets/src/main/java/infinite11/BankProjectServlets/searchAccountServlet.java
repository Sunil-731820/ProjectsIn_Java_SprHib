package infinite11.BankProjectServlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class searchAccountServlet
 */
public class searchAccountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public searchAccountServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int accountNo = Integer.parseInt(request.getParameter("accountNo"));
		BankDAO dao = new BankDAO();
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		Bank bank;
		try {
			bank = dao.searchAccount(accountNo);
			if(bank!=null) {
				out.println("the first name is " + bank.getFirstName()+"<br>");
				out.println("the last name is" + bank.getLastName()+"<br>");
				out.println("The city is " + bank.getCity()+"<br>");
				out.println("the state is " + bank.getState()+"<br>");
				out.println("Amount is "+ bank.getAmount()+"<br>");
				out.println("the cheqFacil is "+ bank.getCheqFacil()+"<br>");
				out.println("the Account Type is " + bank.getAccountType()+"<br>");
				out.println("the status is paid "+ bank.getStatus()+"<br>");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
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
