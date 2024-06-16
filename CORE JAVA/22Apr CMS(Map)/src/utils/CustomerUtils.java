package utils;

import static com.app.customer.ServicePlan.*;
import static java.time.LocalDate.parse;
import static utils.CustomerValidations.validatePword;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.app.customer.Customer;

import custom_exceptions.CustomerException;

public class CustomerUtils {

	// LOCATE ACCOUNT WITH EMAIL
	public static Customer findByEmail(String email, Map<String,Customer> detail) throws CustomerException {
		Customer account = detail.get(email);
		if(email.equals(null))
			throw new CustomerException("EMAIL ID NOT FOUND");
		return account;
	}
	
	// LOCATE ACCOUNT WITH EMAIL AND PASSWORD
		public static boolean matchPassword(String email, String pword, Map<String,Customer> detail) throws CustomerException {
			boolean flag = false;
			for (Customer e : detail.values())
			{
				if ((email.equals(e.getEmail()) && pword.equals(e.getPword())))
					flag=true;
			}
			if(!flag)
				throw new CustomerException("INVALID LOGIN CREDENTIALS");
			return true;
		}

	// CHANGE PASSWORD
	public static void changePassword(String email, String oldpword, Map<String,Customer> detail, Scanner sc)
			throws CustomerException {
		if (matchPassword(email, oldpword, detail)) {
			System.out.println("Enter New Password");
			String newPword = sc.next();
			validatePword(newPword, detail);
			Customer c = findByEmail(email, detail);
			c.setPword(newPword);
		}
	}
	
	//POPULATE DATA FOR MAP
	public static Map<String,Customer> populateMap(){
		Map<String,Customer> cmsMap = new HashMap<>();
			cmsMap.put("ayush9kumar9@gmail.com", new Customer("ayush9kumar9@gmail.com", "Ayush$12345", "ayush", "kumar", 
					SILVER, 1000 ,parse("2000-12-20")));
			cmsMap.put("yassr@yahoo.com", new Customer("yassr@yahoo.com", "Y1234@5678yy", "yassar", "warsi", 
					GOLD, 2000 ,parse("2000-12-12")));
			cmsMap.put("priya@msn.com", new Customer("priya@msn.com", "Priya123@456", "priya", "anand", 
					GOLD, 2000 ,parse("2000-10-10")));
			cmsMap.put("abhinav21@gmail.com", new Customer("abhinav21@gmail.com", "Abhinav$123", "Abhinav", "Singh", 
					PLATINUM, 10000 ,parse("1998-03-23")));
			cmsMap.put("akash234@ygmail.com", new Customer("akash234@ygmail.com", "Akash#12345", "Akash", "Kumar", 
					DIAMOND, 5000 ,parse("1999-11-24")));
			cmsMap.put("abhishek23@gmail.com", new Customer("abhishek23@gmail.com", "Abhi12#56", "Abhishek", "Sharma", 
					DIAMOND, 5000 ,parse("2001-09-11")));
			cmsMap.put("abhijeet99@gmail.com", new Customer("abhijeet99@gmail.com", "Abhijeet$123", "Abhijeet", "Singh", 
					PLATINUM, 10000 ,parse("2000-05-23")));
			System.out.println("Map "+cmsMap);
			return cmsMap;

	}


}