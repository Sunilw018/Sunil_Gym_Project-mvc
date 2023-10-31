package com.sunil.IT.Sunil.Gym.Project.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sunil.IT.Sunil.Gym.Project.model.Contact;

@Repository
public class ContactDao {

	@Autowired
	SessionFactory sf;
	
	
	public Contact insertContact(String name, String mobile, String email) {
		
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		Contact cc = new Contact();
		cc.setName(name);
		cc.setMob(mobile);
		cc.setEmail(email);
		ss.save(cc);
		tr.commit();
		ss.close();
		return cc;
	}

}
