package com.java.spr;

public class Student {
	private int sno;
	private String name;
	private LunchBox lunchBox;
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LunchBox getLunchBox() {
		return lunchBox;
	}
	public void setLunchBox(LunchBox lunchBox) {
		this.lunchBox = lunchBox;
	}
	
	public void showStudent() {
		System.out.println("Student Number " + sno + " "+  "Student Name is " + name);
		System.out.println(lunchBox);
	}
	

}
