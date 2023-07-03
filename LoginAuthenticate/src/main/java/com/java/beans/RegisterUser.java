package com.java.beans;

import java.time.LocalDate;
import java.util.Arrays;

public class RegisterUser {
	private int uid;
	private String name;
	private String addr;
	private String uname;
	private String[] skills;
	private String gender;
	private LocalDate date;
	private String city;
	public RegisterUser() {
		super();
	}
	public RegisterUser(int uid, String name, String addr, String uname, String[] skills,
			String gender, LocalDate date, String city) {
		super();
		this.uid = uid;
		this.name = name;
		this.addr = addr;
		this.uname = uname;
		
		this.skills = skills;
		this.gender = gender;
		this.date = date;
		this.city = city;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	
	public String[] getSkills() {
		return skills;
	}
	public void setSkills(String[] skills) {
		this.skills = skills;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "RegisterUser [uid=" + uid + ", name=" + name + ", addr=" + addr + ", uname=" + uname + ", skills="
				+ Arrays.toString(skills) + ", gender=" + gender + ", date=" + date + ", city=" + city + "]";
	}
	
	
	
}
