package com.sunil.IT.Sunil.Gym.Project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunil.IT.Sunil.Gym.Project.dao.ContactDao;
import com.sunil.IT.Sunil.Gym.Project.model.Contact;

@Service
public class ContactService {

	@Autowired
	ContactDao cd;
	
	public Contact insertContact(String name, String mobile, String email) {
		 return cd.insertContact(name,mobile,email);
	}

}
