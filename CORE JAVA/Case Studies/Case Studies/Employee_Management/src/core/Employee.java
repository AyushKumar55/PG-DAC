package core;

import java.time.LocalDate;

public class Employee {
	private static int auto;
	private int emp_id;
	private String name;
	private LocalDate doj;
	private String phone;
	private String aadhar;
	
	public Employee(String name, LocalDate doj, String phone, String aadhar) {
		super();
		this.emp_id = ++auto;
		this.name = name;
		this.doj = doj;
		this.phone = phone;
		this.aadhar = aadhar;
	}

	@Override
	public String toString() {
		return "[Emp Id: " + emp_id + ", Name: " + name + ", DOJ: " + doj + ", Phone: " + phone + ", Aadhar: "
				+ aadhar;
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDoj() {
		return doj;
	}

	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAadhar() {
		return aadhar;
	}

	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}
	
}
