package com.app.core;

import java.time.LocalDate;

public class Contact 
{
	public Contact(String phonenumber, String name, LocalDate localDate, String email) 
	{
		this.phoneNumber = phonenumber;
		this.name = name;
		this.dateOfBirth = localDate;
		this.email = email;
	}
	public Contact(String newPhNo) {
		// TODO Auto-generated constructor stub
		phoneNumber = newPhNo;
	}
	@Override
	public String toString() 
	{
		return "Name : "+name+", dob : "+dateOfBirth+", email : "+email+", phNo : "+ phoneNumber;
	}
	@Override
	public boolean equals(Object obj) 
	{
		return this.phoneNumber.equals( ((Contact)obj).phoneNumber );
	}
	String phoneNumber, name, email;
	LocalDate dateOfBirth;
	public void setPhoneNo(String newPhNo) {
		// TODO Auto-generated method stub
		phoneNumber = newPhNo;
		
	}
	public LocalDate getDob()
	{
		return dateOfBirth;
	}
	
}
