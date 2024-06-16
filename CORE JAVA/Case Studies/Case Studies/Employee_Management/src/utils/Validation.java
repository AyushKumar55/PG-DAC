package utils;

import java.util.Map;

import core.Employee;
import custom_exception.MyException;

public class Validation {

	public static void validatePhone(Map<Integer,Employee> mapEmployee, String phone) throws MyException {
		
		if (!phone.matches("^[0-9]{10}$")) {
			throw new MyException(
					"Phone number should be all numeric and of length 10");
		}
		
		for(Employee e : mapEmployee.values()) {
			if(e.getPhone().equals(phone))
				throw new MyException("Phone Number is ALREADY REGISTERED !");
		}
	}
	
	public static void validateAadhar(Map<Integer,Employee> mapEmployee, String aadhar) throws MyException {
		
		if(!aadhar.matches("^[0-9]{12}$")) {
			throw new MyException("Aadhaar number should be all numeric, length 12 only, and no spaces");
		}
		
		for(Employee e : mapEmployee.values()) {
			if(e.getPhone().equals(aadhar))
				throw new MyException("Aadhar Number is ALREADY REGISTERED !");
		}
	}
}
