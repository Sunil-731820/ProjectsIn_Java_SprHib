package com.java.spr;

import java.util.List;

public class Faculty {
	
	private String fname;
	private List<Student> studentList;
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public List<Student> getStudentList() {
		return studentList;
	}
	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}
	
	
	public void showAll() {
		System.out.println("Faculty information is " + fname + "sharing the lunch with students ");
		for(Student student: studentList){
			student.showStudent();
		}
		
	}
}
