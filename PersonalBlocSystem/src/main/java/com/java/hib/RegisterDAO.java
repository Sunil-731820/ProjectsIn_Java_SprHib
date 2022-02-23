package com.java.hib;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class RegisterDAO {
	SessionFactory sf;
	Session session;
	
	public String addRegister(Register register) {
		SessionFactory sf = SessionHelper.getFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		s.save(register);
		t.commit();
		return "Registered SuccessFully";
	}
	
	
	public List<Register> showregister(){
		SessionFactory sf = SessionHelper.getFactory();
		Session session = sf.openSession();
		Query q = session.createQuery("from Register");
		List<Register> registerList = q.list();
		return registerList;
	}
	
	

}
