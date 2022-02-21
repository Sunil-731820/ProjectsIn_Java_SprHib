package infinite.RealTimeLeaveManagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class ConnectionHelper {
	public static Connection getconnection() throws SQLException, ClassNotFoundException {
		ResourceBundle rb = ResourceBundle.getBundle("db");
		String driver = rb.getString("drive");
		String url = rb.getString("url");
		String user = rb.getString("user");
		String pwd = rb.getString("password");
		Class.forName(driver);
		Connection conn = DriverManager.getConnection(url,user,pwd);
		return conn;
	}

}
