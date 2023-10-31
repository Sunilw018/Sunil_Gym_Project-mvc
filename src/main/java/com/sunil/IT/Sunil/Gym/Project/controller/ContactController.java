package com.sunil.IT.Sunil.Gym.Project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sunil.IT.Sunil.Gym.Project.model.Contact;
import com.sunil.IT.Sunil.Gym.Project.service.ContactService;

@Controller
public class ContactController {
	@Autowired
	ContactService cs;

	@RequestMapping("/contact")
	public Contact insertContact(@RequestParam("name") String name, @RequestParam("mob") String mobile,
			@RequestParam("email") String email) {
		return cs.insertContact(name, mobile, email);
	}
}
