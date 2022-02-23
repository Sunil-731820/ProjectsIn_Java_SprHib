package com.java.jsf;

import java.sql.SQLException;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="Employee2")
@SessionScoped
public class Employee2 {
	
	private int empId;
	
	private String firstName;
	
	private String lastName;
	
	private String emailId;
	
	private String password;
	
	private String address;
	
	private int pincode;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	static Employee2DAO dao;
	static {
		dao = new Employee2DAO();
	}
	
	public Employee2[] showEmploy()  throws ClassNotFoundException, SQLException {
		return dao.showEmploy();
	}
	
	public String saveEmploy(Employee2 employee2) throws ClassNotFoundException, SQLException {
		dao.addEmploy(employee2);
		return "ShowAllEmployee2.xhtml?faces-redirect=true";
	}
	
	

}
