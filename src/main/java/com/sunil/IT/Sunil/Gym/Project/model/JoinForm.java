package com.sunil.IT.Sunil.Gym.Project.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class JoinForm {
	@Id
	private String name;
	private String mob;
	private String email;
	private String date;
	private String gender;
	private String location;
	private String batch;

	public JoinForm() {
		super();

	}

	public JoinForm(String name, String mob, String email, String date, String gender, String location, String batch) {
		super();
		this.name = name;
		this.mob = mob;
		this.email = email;
		this.date = date;
		this.gender = gender;
		this.location = location;
		this.batch = batch;
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

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getBatch() {
		return batch;
	}

	public void setBatch(String batch) {
		this.batch = batch;
	}

	@Override
	public String toString() {
		return "JoinForm [name=" + name + ", mob=" + mob + ", email=" + email + ", date=" + date + ", gender=" + gender
				+ ", location=" + location + ", batch=" + batch + "]";
	}

	
}
