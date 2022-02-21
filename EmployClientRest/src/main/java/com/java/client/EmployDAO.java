package com.java.client;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployDAO {
	Connection connection;
	PreparedStatement pst;
	
	public Employ[] showEmploy() throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select *from employ";
		pst = connection.prepareStatement(cmd);
		ResultSet res = pst.executeQuery();
		List<Employ>employList = new ArrayList<Employ>();
		Employ employ = null;
		while(res.next()) {
			employ = new Employ();
			employ.setEmpno(res.getInt("Empno"));
			employ.setName(res.getString("name"));
			employ.setGender(Gender.valueOf(res.getString("Gender")));
			employ.setDept(res.getString("Dept"));
			employ.setDesig(res.getString("Desig"));
			employ.setBasic(res.getInt("Basic"));
			employList.add(employ);
		}
		return employList.toArray(new Employ[employList.size()]);
		
	}

}
