package utils;

import java.time.LocalDate;
import java.util.List;

import com.app.customer.Customer;
import com.app.customer.ServicePlan;

import custom_exceptions.CustomerException;

public class CustomerValidations {

	// VALIDATE SIGN UP
	public static Customer validateSignUp(String email, String pword, String fname, String lname, String plan,
			double regamt, String dob, List<Customer> details) throws IllegalArgumentException, CustomerException {

		ServicePlan sPlan = validatePlan(plan);
		validateCharge(sPlan, regamt);
		validateEmail(email, details);
		validatePword(pword, details);

		return new Customer(email, pword, fname, lname, sPlan, regamt, LocalDate.parse(dob));
	}

	// VALIDATE ACCT TYPE
	public static ServicePlan validatePlan(String plan) throws IllegalArgumentException {
		return ServicePlan.valueOf(plan.toUpperCase());
	}

	// VALIDATE ENTERED SUBSCRIPTION AMOUNT WITH CHARGES
	public static void validateCharge(ServicePlan plan, double regamt) throws CustomerException {
		if (regamt != plan.getCharges()) {
			throw new CustomerException("Entered SUBSCRIPTION CHARGES Does Not MATCH its SERVICE PLAN");
		}
	}

	// VALIDATE EMAIL AND DUPLICACY
	public static void validateEmail(String email, List<Customer> details) throws CustomerException {

		Customer Email = new Customer(email);
		if (details.contains(Email)) {
			throw new CustomerException("Email exists, please try another email");
		}

		// Contains @
		int atIndex = email.indexOf('@');
		if (atIndex < 0) {
			throw new CustomerException("Email Id does not contain '@'.");
		}

		// Check for valid TLD (.com, .org, or .net)
		String domain = email.substring(atIndex + 1);
		if (!domain.endsWith(".com") && !domain.endsWith(".org") && !domain.endsWith(".net")) {
			throw new CustomerException("Email Id does not ends with .com, .org, or .net !!!");
		}
	}

	// VALIDATE PASSWORD
	public static void validatePword(String pword, List<Customer> details) throws CustomerException {
		if (!pword.matches("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[#@$*]).{8,20})"))
			throw new CustomerException(
					"Password did not meet required conditions.\nPassword Should have 1 lowercase letter, "
					+ "1 uppercase letter, 1 number, 1 Character(#@$*), and should be atleast 8 characters long");
	}
	
	
	

}