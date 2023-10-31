package com.sunil.IT.Sunil.Gym.Project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.sunil.IT.Sunil.Gym.Project.model.JoinForm;
import com.sunil.IT.Sunil.Gym.Project.service.JoinFormService;

@Controller
public class JoinFormController {

	@Autowired
	JoinFormService js;

	@RequestMapping("/")
	public String name() {
		return "SunilGym";

	}

	@RequestMapping("/SunilGym")
	public String showJoinForm() {
		return "join"; // This should be the name of your HTML file without the .html extension
	}

	@RequestMapping("/join")
	public JoinForm insertClient(@RequestParam("name") String name, @RequestParam("mob") String mobile,
			@RequestParam("email") String email, @RequestParam("date") String joinDate,
			@RequestParam("gender") String gender, @RequestParam("location") String location,
			@RequestParam("batch") String batch) {
		System.out.println(name);

		return js.insertClient(name, mobile, email, joinDate, gender, location, batch);
	}
	
}
