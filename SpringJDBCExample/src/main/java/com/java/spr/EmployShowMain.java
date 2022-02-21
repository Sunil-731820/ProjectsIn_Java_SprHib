package com.java.spr;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployShowMain {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/java/spr/jdbc.xml");
		EmployDAO dao = (EmployDAO)ctx.getBean("employDao");
		List<Employ> employList = dao.showEmploy();
		for (Employ employ : employList) {
			System.out.println(employ);
		}
		
	}

}
