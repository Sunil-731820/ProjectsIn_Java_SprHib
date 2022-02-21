package com.java.jsp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public class StudentDAO {
	
	Connection connection;
	PreparedStatement pst;

	public Student[] showStudent11() throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select *from Student17";
		pst = connection.prepareStatement(cmd);
		ResultSet res = pst.executeQuery();
		List<Student> studentList = new ArrayList<Student>();
		Student student = null;
		while(res.next()) {
			student = new Student();
			student.setFirstName(res.getString("firstName"));
			student.setLastName(res.getString("lastName"));
			student.setAge(res.getInt("age"));
			student.setLocation(res.getString("location"));
			studentList.add(student);
		}
		return studentList.toArray(new Student[studentList.size()]);
	}
	
	
}
