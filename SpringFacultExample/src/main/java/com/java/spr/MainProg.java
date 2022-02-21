package com.java.spr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainProg {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/java/spr/Faculty.xml");
		Faculty f1 = (Faculty) ctx.getBean("beanFaculty");
		f1.showAll();
	}

}
