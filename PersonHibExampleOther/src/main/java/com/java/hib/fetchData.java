package com.java.hib;

import java.util.Iterator;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.metamodel.Metadata;
import org.hibernate.metamodel.MetadataSources;

public class fetchData {
	public static void main(String[] args) {
		StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
        Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();  
          
        SessionFactory factory=meta.getSessionFactoryBuilder().build();  
        Session session=factory.openSession();
         
        Transaction t=session.beginTransaction();   
        
        Query query=session.createQuery("from Employ1");    
        List<Employ1> list=((javax.persistence.Query) query).getResultList();    
            
        Iterator<Employ1> itr=list.iterator(); 
        System.out.println();
		
	}

}
