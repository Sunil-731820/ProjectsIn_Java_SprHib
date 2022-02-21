package com.java.spr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainProg {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/java/spr/Person.xml");
		Person p1 = (Person) ctx.getBean("BeanDinesh");
		p1.showAllInfo();
		
		Person p2 = (Person) ctx.getBean("Beanharish");
		p2.showAllInfo();
		
		
	}

}
