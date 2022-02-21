package com.java.lms;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {
	
	Connection connection;
	PreparedStatement pst ;
	
	
	public Employee searchEmploy(int empno) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select *from Employee where EMP_Id=?";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, empno);
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
	
	public Employee[] showEmploy() throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select *from Employee";
		pst = connection.prepareStatement(cmd);
		List<Employee> employList = new ArrayList<Employee>();
		ResultSet res = pst.executeQuery();
		Employee employee = null;
		while(res.next()) {
			employee = new Employee();
			employee.setEmpId(res.getInt("EMP_ID"));
			employee.setEmpName(res.getString("EMP_NAME"));
			employee.setEmpEmail(res.getString("EMP_MAIL"));
			employee.setEmpMobile(res.getString("EMP_MOB_NO"));
			employee.setEmpDoj(res.getDate("EMP_DT_JOIN"));
			employee.setEmpDept(res.getString("EMP_DEPT"));
			employee.setMgrId(res.getInt("EMP_MANAGER_ID"));
			employee.setLeaveAvail(res.getInt("EMP_AVAIL_LEAVE_BAL"));
			employList.add(employee);
		}
		return employList.toArray(new Employee[employList.size()]);
		
	}

}
