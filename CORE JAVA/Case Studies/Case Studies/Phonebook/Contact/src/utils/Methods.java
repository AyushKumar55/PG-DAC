package utils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.app.Contact;


import custom_exceptions.CustomException;

public class Methods {
	
	// All Contacts Instatiation
	
	public static Map<String, Contact> populateContacts()
	{
		Map<String, Contact> contacts = new HashMap<>();
		
		return contacts;
	}
	
	public static void addContact(Scanner sc, Map<String, Contact> contacts)
	throws CustomException
	{
		//Map<String, PhoneNumbers> phoneNumbers, String name, LocalDate dob, String email
		
		System.out.println("Enter Name: ");
		String name = sc.next();
		
		System.out.println("Enter Date of Birth: ");
		LocalDate dob = LocalDate.parse(sc.next());
		
		// 2 persons cannot have same name and dob
		if(contacts.values().stream().filter(e-> e.getName().equals(name) 
				&& e.getDob().equals(dob) ).count() >0 )
		//	if( contacts.get(name).getName().equals(name) && contacts.get(name).getDob().equals(dob))
			throw new CustomException("Name and Date of Birth of the same "
					+ "person is already present in the Phone Book!!!");
		
		System.out.println("Enter Phone Numbers do you want to store: ");
		int totalPhoneNums = sc.nextInt();
		
		if(totalPhoneNums<1)
			throw new CustomException("Enter Atleast one Phone Number");
		
		List<String> phoneNumbers = new ArrayList<>();
		
		for(int i = 0; i < totalPhoneNums; i++)
		{
			System.out.println("Enter Phone Number: ");
			String phone = sc.next();
			if(!phone.matches("^[0-9]{10}$"))
				throw new CustomException("Phone Number should be of 10 digits");
			
			phoneNumbers.add(phone);
		}
		
		System.out.println("Do you want to add any Email, Press Y to add Email or N to Skip");
		String check = sc.next();
		
		String email =""; // optional ?
		if(check.charAt(0) == 'Y') {
		System.out.println("Enter Email: ");
		email = sc.next();
		}
		
		String key = name+dob;
		Contact newContact = new Contact( phoneNumbers, name , dob , email );
		
		contacts.put( key, newContact);
		
		//System.out.println(key);
		
	}
	
	// Display All Contacts
	
	public static void dispAllContacts(Map<String, Contact> contacts)
	{
		for(Contact e : contacts.values())
		{
			System.out.println(e);
		}
		
	}
	
	// Update Email, Phone Number
	
	public static void updateContact(Scanner sc , Map<String, Contact> contacts) throws CustomException
	{
		System.out.println("Enter Name:");
		String name = sc.next();

		System.out.println("Enter Dob:");
		String dob = sc.next();
		
		String check = name + dob;
		
		if(contacts.get(check) == null)
			throw new CustomException("No such Record with this Name and Dob found!!!");
		
		System.out.println("Enter new Email Address:");
		String email = sc.next();
		
		
		System.out.println("Enter Phone Numbers do you want to store: ");
		int totalPhoneNums = sc.nextInt();
		
		if(totalPhoneNums<1)
			throw new CustomException("Enter Atleast one Phone Number");
		List<String> phoneNumbers = new ArrayList<>();
		
		for(int i = 0; i < totalPhoneNums; i++)
		{
			System.out.println("Enter Phone Number: ");
			String phone = sc.next();
			if(!phone.matches("^[0-9]{10}$"))
				throw new CustomException("Phone Number should be of 10 digits");
			
			phoneNumbers.add(phone);
		}
		
		
		Contact newContact = new Contact( phoneNumbers, name , LocalDate.parse(dob) , email );
		
		contacts.put( check, newContact);
		
		
	}
	
	
}
