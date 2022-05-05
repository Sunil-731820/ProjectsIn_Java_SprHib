package com.java.mvc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
public class ContactDAOImpl implements ContactDAO{
	private JdbcTemplate jdbcTemplate;
	 
    public ContactDAOImpl(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }
    
    public List<Contact> list() {
        String sql = "SELECT * FROM contact";
        List<Contact> listContact;
		try {
			listContact = jdbcTemplate.query(sql, new RowMapper<Contact>() {
    
			    @Override
			    public Contact mapRow(ResultSet rs, int rowNum) throws SQLException {
			        Contact aContact = new Contact();
    
			        aContact.setId(rs.getInt("contact_id"));
			        aContact.setName(rs.getString("name"));
			        aContact.setEmail(rs.getString("email"));
			        aContact.setAddress(rs.getString("address"));
			        aContact.setTelephone(rs.getString("telephone"));
    
			        return aContact;
			    }
    
			});
		} catch (DataAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
     
        return listContact;
    }
 

}
