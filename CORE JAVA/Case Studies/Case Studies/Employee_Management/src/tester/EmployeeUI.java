package tester;

import static utils.EmployeeUtils.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import core.Employee;

public class EmployeeUI {

	public static void main(String[] args) {
		
		try(Scanner sc =  new Scanner(System.in)){
			
			Map<Integer,Employee> mapEmployee = new HashMap<>();
			
			boolean exit = false;
			while(!exit) {
				System.out.println("Options\n"
						+ "1. Add Full Time Employee\n"
						+ "2. Add Part Time Employee\n"
						+ "3. Delete an Employee by Emp Id\n"
						+ "4. Search Employee by Aadhar No.\n"
						+ "5. View All Employee Details\n"
						+ "6. View All Employee Details Sorted by DOJ\n"
						+ "0. Exit");
				try {
					switch(sc.nextInt()) {
					case 1:
						addFTE(mapEmployee, sc);
						break;
						
					case 2:
						addPTE(mapEmployee, sc);
						break;
						
					case 3:
						deleteEmp(mapEmployee, sc);
						break;
						
					case 4:
						searchEmp(mapEmployee, sc);
						break;
						
					case 5:
						showAllEmp(mapEmployee);
						break;
						
					case 6:
						sortByDoj(mapEmployee);
						break;
						
					case 0:
						exit = true;
						System.out.println("Thank You...Terminating the app");
						break;
						
					default:
						System.out.println("Invalid Choice");
					}
				}
				catch(Exception e) {
					sc.nextLine();
					System.out.println("Error: "+e);
					System.out.println("Please Retry !!!");
				}
			}
		}
	}
}
