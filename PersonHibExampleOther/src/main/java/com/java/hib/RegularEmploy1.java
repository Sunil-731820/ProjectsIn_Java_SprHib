package com.java.hib;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity  
@DiscriminatorValue("RegularEmploy1")  
public class RegularEmploy1 extends Employ1 {
	@Column(name="salary")    
	private float salary;  
	  
	@Column(name="bonus")     
	private int bonus;

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	} 

	
	

}
