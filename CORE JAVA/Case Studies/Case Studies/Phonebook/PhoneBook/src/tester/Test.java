package tester;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import static validaions.Validate.*;
import com.app.core.Contact;

public class Test {

	

	public static void main(String[] args) 
	{
		HashMap<String, ArrayList<Contact>> hm = new HashMap<String, ArrayList<Contact>>(); 
		System.out.println("Choose from below menu\n1.Add new contact\n2.Display all Contact Details"
				+ "\n3.Update contact details for given name and dob\n"
				+ "4.remove all contacts above 80 years of age");
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			try 
			{
				switch (sc.nextInt()) 
				{
					case 1: {
						System.out.println("enter phonenumber, name , dob, email");
						vaildateNewContact(sc.next(),sc.next(),sc.next(),sc.next(),hm);
						break;
					}
					case 2: {
						hm.forEach((k,v)-> v.forEach(j -> System.out.println(j)));
						
						break;
					}
					case 3: {
						System.out.println("enter name, dob, old phNo, new phNo");
						validateUpdateContact(sc.next(),sc.next(),sc.next(),sc.next(),hm);
						break;
					}
					case 4: {
						
						hm.values().forEach(k -> k.removeIf(l -> l.getDob().plusYears(80).isBefore(LocalDate.now())));
						break;
					}
				}	
					
			} 
			catch (Exception e) 
			{
				System.out.println(e);
			}
		}
	}
}
