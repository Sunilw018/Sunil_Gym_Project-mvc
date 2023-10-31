package com.sunil.IT.Sunil.Gym.Project.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.sunil.IT.Sunil.Gym.Project.model.JoinForm;

@Repository
public class JoinFormDao {

	@Autowired
	SessionFactory sf ;
	
	public JoinForm insertClient(String name, String mobile, String email, String joinDate, String gender, String location,
			String batch) {
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		JoinForm jf = new JoinForm();
		jf.setName(name);
		jf.setMob(mobile);
		jf.setEmail(email);
		jf.setDate(joinDate);
		jf.setGender(gender);
		jf.setLocation(location);
		jf.setBatch(batch);
		ss.save(jf);
		tr.commit();
		ss.close();
		return jf;
		
	}


}
