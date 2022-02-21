package infinite.RealTimeLeaveManagement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeDAO {
	Connection connection;
	PreparedStatement pst;
	public Employee searchEmploy(int empId) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getconnection();
		String cmd = "select *from Employee where emp_id=?";
		pst = connection.prepareStatement(cmd);
		ResultSet res = pst.executeQuery();
		Employee employee = null;
		if(res.next()) {
			employee = new Employee();
			employee.setEmpId(res.getInt("EMP_ID"));
			employee.setEmpName(res.getString("EMP_NAME"));
			employee.setEmpEmail(res.getString("EMP_MAIL"));
			employee.setEmpMobile(res.getString("EMP_MOB_NO"));
			employee.setEmpDoj(res.getDate("EMP_DT_JOIN"));
			employee.setEmpDept(res.getString("EMP_DEPT"));
			employee.setMgrId(res.getInt("EMP_MANAGER_ID"));
			employee.setLeaveAvail(res.getInt("EMP_AVAIL_LEAVE_BAL"));
		}
		return employee;
	}

}
