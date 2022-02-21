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
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Issue
 */
public class Issue extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Issue() {
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
		HttpSession session = request.getSession(true);
		String username = (String) sct.getAttribute("Username");
		RequestDispatcher rd1 = sct.getRequestDispatcher("/UserAccount");
		rd1.include(request, response);
		if(request.getParameterValues("bookid")!=null){
			String str[] = request.getParameterValues("bookid");
			try {
				Connection cp = ConnectionHelper.getConnection();
				for(String s :str) {
					String sq1 = "select *from TranBook where Username=?";
					PreparedStatement pst = cp.prepareStatement(sq1);
					pst.setString(1, username);
					ResultSet res = pst.executeQuery();
					String uname = null;
					Date fromdate;
					Date todate = new Date(session.getLastAccessedTime());
					if(res.next()) {
						uname = res.getString("Username");
						fromdate = res.getDate("Fromdate");
						if(username.equals(uname)) {
							String cmd1 = "delete from TranBook where BookId=? and Username=?";
							PreparedStatement pst1 = cp.prepareStatement(cmd1);
							pst1.setString(1, username);
							pst1.setString(2, s);
							pst1.setDate(3, (java.sql.Date) fromdate);
							pst1.setDate(4, (java.sql.Date) todate);
							pst1.executeUpdate();
							
							String cmd2 = "insert into TransReturn(UserName,BookId,FromDate,ToDate)"
									+ "values(?,?,?,?)";
							PreparedStatement pst2 = cp.prepareStatement(cmd2);
							pst2.setString(1, username);
							pst2.setString(2, s);
							pst2.setDate(3,(java.sql.Date) fromdate);
							pst2.setDate(4, (java.sql.Date) todate);
							pst2.executeUpdate();
							
							String cmd3 = "select ToralBooks from Books where Id=?";
							PreparedStatement pst3 = cp.prepareStatement(cmd3);
							pst3.setString(1, s);
							ResultSet res1 = pst3.executeQuery();
							res1.next();
							String btotal = res1.getString("ToralBooks");
							int bt = Integer.parseInt(btotal);
							bt = bt +1;
							
							String cmd4 = "Update Books set ToralBooks =? where id=? ";
							PreparedStatement pst4 = cp.prepareStatement(cmd4);
							pst4.setInt(1, bt);
							pst4.setString(2, s);
							pst4.executeUpdate();
							out.write("<br/><br/>The book with Id ("+s+") is returned !...");
						}
					}
				}
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

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
