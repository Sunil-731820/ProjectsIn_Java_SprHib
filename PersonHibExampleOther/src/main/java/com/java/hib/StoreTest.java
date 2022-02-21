package com.java.hib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.metamodel.Metadata;
import org.hibernate.metamodel.MetadataSources;

public class StoreTest {
	public static void main(String[] args) {
		System.out.println("ho");
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build(); 
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		
		SessionFactory factory=meta.getSessionFactoryBuilder().build();  
        Session session=factory.openSession();  
        
        Transaction t=session.beginTransaction(); 
        
//        i have created the class of super class
		
		SessionFactory sf = SessionHelper.getFactory();
		Session s = sf.openSession();
        Employ1 e1 = new Employ1();
        e1.setName("Gaurav Chawla");
        
//        this regular class Inheriting the Employ class also
        RegularEmploy1 e2 = new RegularEmploy1();
        e2.setName("Vivek chawla");
        e2.setBonus(50000);
        e2.setSalary(0);
        
        
//        same Contract employ class also inheriting the Employ class 
        ContractEmploy1 e3 = new ContractEmploy1();
        e3.setName("Arjun Kumar");    
        e3.setPay_per_hour(1000);    
        e3.setContract_duration("15 hours");    
        
        
        session.persist(e1);    
        session.persist(e2);    
        session.persist(e3);    
            
        t.commit();    
        session.close();    
        System.out.println("success");
		
	}

}
