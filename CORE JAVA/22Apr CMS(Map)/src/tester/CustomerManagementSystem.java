package tester;

import static utils.CustomerUtils.changePassword;
import static utils.CustomerUtils.findByEmail;
import static utils.CustomerUtils.matchPassword;
import static utils.CustomerValidations.validateSignUp;

import java.util.Map;
import java.util.Scanner;

import com.app.customer.Customer;

import static utils.CustomerUtils.*;


public class CustomerManagementSystem {

	public static void main(String[] args) {
		try (Scanner sc=new Scanner(System.in)){
			
			//Creating empty ArrayList<E>to store customer details
			
			Map<String,Customer> CustDetails= populateMap();
			boolean exit = false;
			while (!exit) {
				System.out.println("OPTIONS:\n"
						+ "1 - Sign Up \n"
						+ "2 - Sign In \n"
						+ "3 - Change Password \n"
						+ "4 - Unsubscribe \n"
						+ "5 - Display All Customers \n"
						+ "0 - Exit \n");
				System.out.println("Choose");
				try {
					switch (sc.nextInt()) {
					case 1:
						//SIGN UP
						System.out.println("Enter Your Details \n"
								+ "Email Id | Password | First Name | Last Name | Service Plan | Susbscription Amount | Date of  Birth");
						Customer details = validateSignUp(sc.next(), sc.next(), sc.next(), sc.next(), 
								sc.next(), sc.nextDouble(), sc.next(), CustDetails);
						CustDetails.put(details.getEmail(),details);
						System.out.println("Customer Sign Up Successful");
						break;
						
					case 2:
						//SIGN IN
						System.out.println("Enter Email Id and Password");
						if(matchPassword(sc.next(), sc.next(), CustDetails))
							System.out.println("LOGIN SUCCESSFUL");
						break;
						
					case 3:
						//CHANGE PASSWORD
						System.out.println("Enter Email Id and Password");
						changePassword(sc.next(),sc.next(), CustDetails, sc);
						break;
						
						
					case 4:
						//UNSUBSCRIBE
						System.out.println("Enter Email Id to Unsubscribe");
						Customer a = findByEmail(sc.next(), CustDetails);
						a = CustDetails.remove(sc.next());
						System.out.println("Unsubscribed Successfully !!! Account: "+a);
						break;
						
					case 5:
						//DISPLAY ALL CUSTOMERS
						System.out.println("All Customer Details: ");
					    for(Customer e : CustDetails.values()) {
					    	System.out.println("Customer Id "+e.getCustId()+" - "+e);
					    }
					    break;
					
					case 0:
						//EXIT
						exit = true;
						break;
					}
					
				}catch (Exception e) {
					sc.nextLine();
					System.out.println(e);
					System.out.println("Please retry");
				}
			}
		}
	}
}
