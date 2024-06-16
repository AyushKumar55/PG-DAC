package validaions;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

import com.app.core.Contact;

import exceptions.ContactException;

public class Validate 
{
	
	public static void vaildateNewContact(String phonenumber, String name, String dob, String email,HashMap<String, ArrayList<Contact>> hm ) throws ContactException  
	{
		Contact c = new Contact(phonenumber,name,LocalDate.parse(dob),email);
		ArrayList<Integer> i = new ArrayList<Integer>();
		hm.forEach((k,v)-> v.forEach(j ->  {
				if(j.equals(c))
				{
					
					i.add(1);
				}
				
			}
		)); 
		if(i.size() > 0)
		{
			
			throw new ContactException("Error : Duplicate contact no !!");
		}
		
		String key = name+dob;
		if(hm.containsKey(key))
		{
			hm.get(key).add(c);
		}
		else
		{
			ArrayList<Contact> al = new ArrayList<Contact>();
			al.add(c);
			hm.put(key, al);
		}
		
	}//name, dob, old phNo, new phNo
	public static void validateUpdateContact(String name, String dob, String oldPhNo, String newPhNo,HashMap<String, ArrayList<Contact>> hm ) throws ContactException
	{
		final Contact c = new Contact(newPhNo);
		ArrayList<Integer> i = new ArrayList<Integer>();
		if(!hm.containsKey(name+dob))
		{
			throw new ContactException("Error : Can not update to as this user does not exists!!");
		}
		hm.get(name+dob).forEach( k -> {
			if(k.equals(c) ) {
			i.add(1);
		}} );
		if(i.size() > 0)
		{
			throw new ContactException("Error : Can not update to this contact no as it already exists!!");
		}
		final Contact cc = new Contact(oldPhNo);
		hm.get(name+dob).forEach( k -> {
			if(k.equals(cc) ) 
			{
				i.add(1);
				k.setPhoneNo(newPhNo);
			}
			} );
		if(i.size() == 0)
		{
			throw new ContactException("Error : Can not update this contact no, it does not exists!!");
		}
	}
	
}
