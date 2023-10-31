package com.sunil.IT.Sunil.Gym.Project.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Contact {
	
	private String name;
	@Id
	private String mob;
	private String email;
	
	public Contact() {
		super();
		
	}

	public Contact(String name, String mob, String email) {
		super();
		this.name = name;
		this.mob = mob;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMob() {
		return mob;
	}

	public void setMob(String mob) {
		this.mob = mob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Contact [name=" + name + ", mob=" + mob + ", email=" + email + "]";
	}
	
}
