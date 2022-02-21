package com.java.spr;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class EmployDAO {
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
//	This is the showEmploy Function from the database 
	
	public List<Employ> showEmploy(){
		String cmd = "select *from Employ";
		List<Employ> employList = jdbcTemplate.query(cmd,new RowMapper() {

			@Override
			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				Employ employ = new Employ();
				employ.setEmpNo(rs.getInt("empNo"));
				employ.setName(rs.getString("name"));
				employ.setGender(Gender.valueOf(rs.getString("gender")));
				employ.setDept(rs.getString("dept"));
				employ.setDesig(rs.getString("desig"));
				employ.setBasic(rs.getInt("basic"));
				return employ;
			}
		});
		return employList;
	}
	
	
//	this is the function for search operation in Database 
	
	
	

}
