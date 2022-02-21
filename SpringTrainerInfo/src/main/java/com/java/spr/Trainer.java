package com.java.spr;

import java.util.List;

public class Trainer {
	private String trainerName;
	private String location;
	private List<Student> studentList;
	public String getTrainerName() {
		return trainerName;
	}
	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public List<Student> getStudentList() {
		return studentList;
	}
	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}
	
	public void show() {
		System.out.println("trainer Name is " + trainerName);
		System.out.println("The Location is " + location);
		System.out.println("students are ");
		for(Student student: studentList) {
			System.out.println(student);
		}
		
	}
	

}
