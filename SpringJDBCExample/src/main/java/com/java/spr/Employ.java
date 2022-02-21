package com.java.spr;

public class Employ {
	
	private int empNo;
	private String name;
	private Gender gender;
	private String dept;
	private String desig;
	private int basic;
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	public int getBasic() {
		return basic;
	}
	public void setBasic(int basic) {
		this.basic = basic;
	}
	@Override
	public String toString() {
		return "Employ [empNo=" + empNo + ", name=" + name + ", gender=" + gender + ", dept=" + dept + ", desig="
				+ desig + ", basic=" + basic + "]";
	}
	
	
	
}
