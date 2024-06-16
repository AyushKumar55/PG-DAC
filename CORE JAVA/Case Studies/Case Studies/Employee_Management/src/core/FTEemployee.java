package core;

import java.time.LocalDate;

public class FTEemployee extends Employee{
	private double monthlySalary;
	
	
	public FTEemployee(String name, LocalDate doj, String phone, String aadhar, double monthlySalary) {
		super(name,doj,phone,aadhar);
		this.monthlySalary = monthlySalary;
	}

	@Override
	public String toString() {
		return super.toString()+ ", Monthly Salary: " + monthlySalary + "]";
	}

	public double getMonthlySalary() {
		return monthlySalary;
	}


	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}
}
