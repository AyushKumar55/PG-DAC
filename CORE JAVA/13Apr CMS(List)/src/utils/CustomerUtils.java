package utils;

import java.util.List;
import java.util.Scanner;

import com.app.customer.Customer;

import custom_exceptions.CustomerException;
import static utils.CustomerValidations.validatePword;

public class CustomerUtils {

	// LOCATE ACCOUNT WITH EMAIL
	public static Customer findByEmail(String email, List<Customer> detail) throws CustomerException {
		Customer emailId = new Customer(email);
		int index = detail.indexOf(emailId);
		if (index == -1)
			throw new CustomerException("EMAIL ID NOT FOUND");
		return detail.get(index);
	}
	
	// LOCATE ACCOUNT WITH EMAIL AND PASSWORD
		public static boolean matchPassword(String email, String pword, List<Customer> detail) throws CustomerException {
			boolean flag = false;
			for (Customer e : detail)
			{
				if ((email.equals(e.getEmail()) && pword.equals(e.getPword())))
					flag=true;
			}
			if(!flag)
				throw new CustomerException("INVALID LOGIN CREDENTIALS");
			return true;
		}

	// CHANGE PASSWORD
	public static void changePassword(String email, String oldpword, List<Customer> detail, Scanner sc)
			throws CustomerException {
		if (matchPassword(email, oldpword, detail)) {
			System.out.println("Enter New Password");
			String newPword = sc.next();
			validatePword(newPword, detail);
			Customer c = findByEmail(email, detail);
			c.setPword(newPword);
		}
	}

	

}