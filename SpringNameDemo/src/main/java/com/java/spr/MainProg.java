package com.java.spr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainProg {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/java/spr/Name.xml");
		Name name1 = (Name) ctx.getBean("bean1");
		System.out.println(name1.fullName());
		
		Name name2 = (Name) ctx.getBean("bean2");
		System.out.println(name2.fullName());
		
	}

}
