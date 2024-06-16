package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;

import core.Cricketer;
import custom_exception.MyException;

public class CricketerUtils {

	public static void populateMap(Map<String, Cricketer> CricketMap) {
		CricketMap.put("ayush9kumar9@gmail.com",
				new Cricketer("Ayush Kumar", 23, "ayush9kumar9@gmail.com", "6205853886", 234));
		CricketMap.put("yassr@yahoo.com", new Cricketer("Yassar Warsi", 24, "yassr@yahoo.com", "6205853889", 320));
		CricketMap.put("abhis@gmail.com", new Cricketer("Abhishek Pandey", 22, "abhis@gmail.com", "6205853876", 289));
		CricketMap.put("priya@msn.com", new Cricketer("Priya Anand", 23, "priya@msn.com", "6205853586", 310));
		CricketMap.put("abhinav21@gmail.com",
				new Cricketer("Abhinav Singh", 21, "abhinav21@gmail.com", "6205853386", 232));
	}

	public static void addCricketers(Map<String, Cricketer> CricketMap, Scanner sc) {
		sc.nextLine();
		System.out.print("Enter Name: ");
		String name = sc.nextLine();
		System.out.print("Enter Age: ");
		int age = sc.nextInt();
		System.out.print("Enter Email: ");
		String email = sc.nextLine();
		System.out.print("Enter Phone No.: ");
		String phone = sc.nextLine();
		System.out.print("Enter Rating: ");
		int rating = sc.nextInt();

		Cricketer c = new Cricketer(name, age, email, phone, rating);
		CricketMap.put(c.getEmail_id(), c);
	}

	public static void ModifyRating(Map<String, Cricketer> CricketMap, Scanner sc) throws MyException {
		sc.nextLine();
		System.out.print("Enter Email Id: ");
		String email = sc.nextLine();
		if (CricketMap.containsKey(email)) {
			Cricketer c = CricketMap.get(email);
			System.out.print("Enter new rating: ");
			int rating = sc.nextInt();
			c.setRating(rating);
			System.out.println("After Modify: " + c);
		} else
			throw new MyException("Data Not Found !!!");

	}

	public static void SearchByName(Map<String, Cricketer> CricketMap, Scanner sc) {
		sc.nextLine();
		System.out.println("Enter Name");
		String name = sc.nextLine();
		System.out.println("Cricketers by Name: " + name);
		CricketMap.values().stream().filter(e -> e.getName().equals(name)).forEach(e -> System.out.println(e));
	}

	public static void DisplayAll(Map<String, Cricketer> CricketMap) {
		CricketMap.values().forEach(e -> System.out.println(e));
	}

	public static void SortByRaitng(Map<String, Cricketer> CricketMap) {
		System.out.println("Data Sorted by Rating");
		Comparator<Cricketer> comp = (c1, c2) -> ((Integer)c1.getRating()).compareTo(c2.getRating());
		CricketMap.values().stream().sorted(comp).forEach(c -> System.out.println(c));
	}

	public static void serialize(Map<String, Cricketer> CricketMap, String filename)
			throws FileNotFoundException, IOException {
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
			out.writeObject(CricketMap);
		}
	}

	public static Object deserialize(Map<String, Cricketer> CricketMap, String filename)
			throws FileNotFoundException, IOException, ClassNotFoundException {
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
			return in.readObject();
		}
	}

}
