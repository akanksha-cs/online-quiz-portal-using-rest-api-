package com.example.demo.bean;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "participant")
public class Participant {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int pid;
	private String firstname;
	private String lastname;
	private int age;
	private String emailid;
	private String password;
	

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

	public int getPid() {
		return pid;
	}
	public Participant(int pid, String firstname, String lastname, int age, String emailid, String password) {
	super();
	this.pid = pid;
	this.firstname = firstname;
	this.lastname = lastname;
	this.age = age;
	this.emailid = emailid;
	this.password = password;
}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getfirstname() {
		return firstname;
	}
	public void setFname(String firstname) {
		this.firstname = firstname;
	}
	public String getLname() {
		return lastname;
	}
	public void setLname(String lastname) {
		this.lastname = lastname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

@Override
public String toString() {
	return "Participants [pid=" + pid + ", firstname=" + firstname + ", lastname=" + lastname + ", age=" + age + ", emailid="
			+ emailid + ", password=" + password + "]";
}

	public Participant() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}