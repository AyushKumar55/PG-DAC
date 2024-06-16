package core;

import java.time.LocalDate;

public class PTEemployee extends Employee{
	
	private double hourlyPayment;
	
	public PTEemployee(String name, LocalDate doj, String phone, String aadhar, double hourlyPayment) {
		super(name,doj,phone,aadhar);
		this.hourlyPayment = hourlyPayment;
	}
	
	@Override
	public String toString() {
		return super.toString()+ ", Hourly Payment: " + hourlyPayment + "]";
	}

	public double getHourlyPayment() {
		return hourlyPayment;
	}

	public void setHourlyPayment(double hourlyPayment) {
		this.hourlyPayment = hourlyPayment;
	}

}
