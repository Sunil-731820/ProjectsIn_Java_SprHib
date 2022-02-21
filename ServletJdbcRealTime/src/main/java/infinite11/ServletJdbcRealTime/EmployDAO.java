package infinite11.ServletJdbcRealTime;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployDAO {
	Connection connection;
	PreparedStatement pst;
public static EmployDAO dao;
	
	private EmployDAO() {}
	
	public static EmployDAO getInstance() {
		if (dao==null) {
			dao = new EmployDAO();
		}
		return dao;
	}
	public String addEmploy(Employ employ) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "insert into Employ(empno,name,gender,dept,desig,basic) "
				+ " values(?,?,?,?,?,?)";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, employ.getEmpno());
		pst.setString(2, employ.getName());
		pst.setString(3, employ.getGender().toString());
		pst.setString(4, employ.getDept());
		pst.setString(5, employ.getDesig());
		pst.setInt(6, employ.getBasic());
		pst.executeUpdate();
		return "Record Inserted...";
	}

}
