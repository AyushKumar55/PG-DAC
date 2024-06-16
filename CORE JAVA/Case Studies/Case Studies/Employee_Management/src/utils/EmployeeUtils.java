package utils;

import static java.time.LocalDate.parse;
import static utils.Validation.validateAadhar;
import static utils.Validation.validatePhone;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;

import core.Employee;
import core.FTEemployee;
import core.PTEemployee;
import custom_exception.MyException;

public class EmployeeUtils {

	public static void addFTE(Map<Integer, Employee> mapEmployee, Scanner sc) throws MyException {
		sc.nextLine();
		System.out.print("Enter Name: ");
		String name = sc.nextLine();
		System.out.print("Enter DOJ: ");
		LocalDate doj = parse(sc.next());
		System.out.print("Enter Phone No.: ");
		String phone = sc.next();
		validatePhone(mapEmployee, phone);
		System.out.print("Enter Aadhar No.: ");
		String aadhar = sc.next();
		validateAadhar(mapEmployee, aadhar);
		System.out.print("Enter Monthly Salary: ");
		double salary = sc.nextDouble();

		Employee e = new FTEemployee(name, doj, phone, aadhar, salary);
		mapEmployee.put(e.getEmp_id(), e);
		
		System.out.println("Employee Data Added Successfully");
	}

	public static void addPTE(Map<Integer, Employee> mapEmployee, Scanner sc) {
		sc.nextLine();
		System.out.print("Enter Name: ");
		String name = sc.nextLine();
		System.out.print("Enter DOJ: ");
		LocalDate doj = parse(sc.nextLine());
		System.out.print("Enter Phone No.: ");
		String phone = sc.nextLine();
		System.out.print("Enter Aadhar No.: ");
		String aadhar = sc.nextLine();
		System.out.print("Enter Hourly Payment: ");
		double payment = sc.nextDouble();

		Employee e = new PTEemployee(name, doj, phone, aadhar, payment);
		mapEmployee.put(e.getEmp_id(), e);

		System.out.println("Employee Data Added Successfully");
	}

	public static void deleteEmp(Map<Integer, Employee> mapEmployee, Scanner sc) {
		System.out.println("Enter Emp Id");
		int id = sc.nextInt();
		if (mapEmployee.containsKey(id)) {
			mapEmployee.values().removeIf(e -> e.getEmp_id() == id);
			System.out.println("Employee Detail DELETED Successfully");
		}
	}

	public static void searchEmp(Map<Integer, Employee> mapEmployee, Scanner sc) {
		sc.nextLine();
		System.out.println("Enter Aadhar No. for Searching");
		String aadhar = sc.next();
		boolean flag = false;
		for (Employee e : mapEmployee.values())
			if (e.getAadhar().equals(aadhar)) {
				System.out.println("Employee Data\n" + e);
				flag = true;
			}
		if(flag==false)
			System.out.println("No Employee Data with this Aadhar No. Found");
	}

	public static void showAllEmp(Map<Integer, Employee> mapEmployee) {
		System.out.println("All Employees: ");
		mapEmployee.values().forEach(e -> System.out.println(e));
	}

	public static void sortByDoj(Map<Integer, Employee> mapEmployee) {
		System.out.println("All Employees Sorted By DOJ ");
		Comparator<Employee> comp = (p1, p2) -> p1.getDoj().compareTo(p2.getDoj());
		mapEmployee.values().stream().sorted(comp).forEach(e -> System.out.println(e));
	}
}
