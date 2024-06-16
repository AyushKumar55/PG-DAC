package com.app.customer;

import java.time.LocalDate;

/*1.Customer should be assigned system generated (auto increment) customer id : int
Store - first name, last name email(string),password(string),registrationAmount(double),dob(LocalDate),plan(ServicePlan : enum)
Unique ID - email*/

public class Customer {
	public static int autoId=0;
	private int custId;
	private String email;
	private String pword;
	private String fname;
	private String lname;
	private ServicePlan plan;
	private double regamt;
	private LocalDate dob;
	
//	constructor to initialize customer details
	

	public Customer(String email, String pword, String fname, String lname, ServicePlan plan, double regamt, LocalDate dob) {
		super();
		this.custId = ++autoId;
		this.email = email;
		this.pword = pword;
		this.fname = fname;
		this.lname = lname;
		this.plan = plan;
		this.regamt = regamt;
		this.dob = dob;
	}
	
	//Override toString to return Customer Details
		@Override
		public String toString() {
			return "Email Id: "+email+" | Password: "+pword+" | First Name: " +fname+" | Last Name: " 
		+lname+" | Service Plan: "+plan+" | Date of  Birth: " +dob;
		}
	
//	add overloaded constructor to wrap primary key,i.e., Email Id
	public Customer(String email) {
	super();
	this.email= email;
	}
	
	@Override
	public boolean equals(Object o) {
		if(o instanceof Customer) {
			Customer c = (Customer) o;
			return this.email.equals(c.email);
		}
		return false;
	}
	
	public String getPword() {
		return pword;
	}

	public void setPword(String pword) {
		this.pword = pword;
	}

	public int getCustId() {
		return custId;
	}

	public String getEmail() {
		return email;
	}
}
