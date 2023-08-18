package com.sms.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="students")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="first_name", nullable = false)
	private String firstname;
	
	@Column(name="last_name")
	private String lastname;
	
	@Column(name="department")
	private String department;
	
	@Column(name="email")
	private String email;
	
	@Column(name="fees")
	private int fees;
	
	//default constructor
	public Student() {
		
	}
	
	//constructor using fields
	public Student(String firstname, String lastname, String department, String email, int fees) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.department = department;
		this.email = email;
		this.fees = fees;
	}
	
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}

	

}
