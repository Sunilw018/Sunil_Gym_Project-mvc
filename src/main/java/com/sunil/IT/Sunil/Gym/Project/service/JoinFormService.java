package com.sunil.IT.Sunil.Gym.Project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.sunil.IT.Sunil.Gym.Project.dao.JoinFormDao;
import com.sunil.IT.Sunil.Gym.Project.model.JoinForm;

@Service
public class JoinFormService {

	@Autowired
	JoinFormDao jd;

	public JoinForm insertClient(String name, String mobile, String email, String joinDate, String gender,
			String location, String batch) {
		return jd.insertClient(name,mobile,email,joinDate,gender,location,batch);
	}
	

}
