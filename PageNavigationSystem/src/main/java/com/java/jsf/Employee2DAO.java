package com.java.jsf;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Employee2DAO {
	Connection connection;
	PreparedStatement pst;
	
	public Employee2[] showEmploy() throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select *from Employee2";
		pst = connection.prepareStatement(cmd);
		ResultSet res = pst.executeQuery();
		List<Employee2> employList = new ArrayList<Employee2>();
		Employee2 employ = null;
		while(res.next()) {
			employ = new Employee2();
			employ.setEmpId(res.getInt("empId"));
			employ.setFirstName(res.getString("firstName"));
			employ.setLastName(res.getString("lastName"));
			employ.setEmailId(res.getString("emailId"));
			employ.setPassword(res.getString("password"));
			employ.setAddress(res.getString("address"));
			employ.setPincode(res.getInt("pincode"));
			employList.add(employ);
		}
		return employList.toArray(new Employee2[employList.size()]);
	}
	
	
	public String addEmploy(Employee2 employee2) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "insert into Employee2(empId,firstName,lastName,emailId,password,address,pincode) "
				+ " values(?,?,?,?,?,?,?)";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, employee2.getEmpId());
		pst.setString(2, employee2.getFirstName());
		pst.setString(3, employee2.getLastName());
		pst.setString(4, employee2.getEmailId());
		pst.setString(5, employee2.getPassword());
		pst.setString(6, employee2.getAddress());
		pst.setInt(7, employee2.getPincode());
		pst.executeUpdate();
		return "Employ Addedd SuccessFully";
		
	}

}
