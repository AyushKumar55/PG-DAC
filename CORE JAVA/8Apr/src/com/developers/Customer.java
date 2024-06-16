package com.developers;

public class Customer {
	private int id;
	private String name;
	private String address;

	public Customer(int id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	public String toString() {
		return "Customer Id: "+id+"\nCustomer Name: "+
				name+"\nCustomer Address: "+address+"\n";
	}
}