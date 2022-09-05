package com.example.demo.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name = "login")
public class login {
	@Id
	private String emailid;
	private String password;
	private String user;
	
	
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTypeofuser() {
		return user;
	}
	public void setTypeofuser(String typeofuser, String user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "Login [emailid=" + emailid + ", password=" + password + ", user=" + user + "]";
	}
	public login(String emailid, String password, String user) {
		super();
		this.emailid = emailid;
		this.password = password;
		this.user = user;
	}
	public login() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}