package tester;

import static utils.Methods.*;

import java.util.Map;
import java.util.Scanner;

import com.app.Contact;

public class PhoneBook {

	public static void main(String[] args) {
		
		
		
		try(Scanner sc = new Scanner(System.in))
		{
			Map<String, Contact> contacts = populateContacts();
			// Name is PK
			
			int choice = 99;
			 while(choice!=0)
			 {
				 try {
					 
					 System.out.println("\n"
					 		+ "Press 1 to Add new Contact\n"
					 		+ "Press 2 to Display All Contacts\n"
					 		+ "Press 0 to Exit");
					 choice = sc.nextInt();
					 switch (choice) {
					case 1: {
						addContact(sc, contacts);
						break;
					}
					case 2: {
						dispAllContacts(contacts);
						break;
					}
					case 3: {
						updateContact(sc, contacts);
						break;
					}
					default:
						throw new IllegalArgumentException("Unexpected value: " + choice);
					}
					 
				 }catch(Exception e )
				 {
					 sc.nextLine();
					 System.out.println(e);
				 }
			 }
		}
		

	}

}
