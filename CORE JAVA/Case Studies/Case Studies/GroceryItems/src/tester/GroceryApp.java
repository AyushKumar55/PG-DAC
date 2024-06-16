package tester;


import static utils.GroceryUtils.populateList;
import static utils.GroceryUtils.removeItem;
import static utils.GroceryUtils.storeData;
import static utils.Validations.addNewItem;
import static utils.Validations.findByItemName;
import static utils.Validations.validateQty;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import core.Grocery;
import custome_exception.MyException;

public class GroceryApp {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			List<Grocery> ItemsRecord = new ArrayList<>();
			populateList(ItemsRecord);
			//Map<String,Grocery> map = populateMap(populateList());
			boolean exit = false;
			while(!exit) {
				System.out.println("OPTIONS:\n"
						+ "1 - Add New Item \n"
						+ "2 - Update the Quantity of a Item \n"
						+ "3 - Display all the Grocery Items \n"
						+ "4 - Remove all empty Stock Items \n"
						+ "5 - Display Items of which stock was updated in last 3 days \n"
						+ "0 - Exit \n");
				System.out.println("Choose");
				try {
					switch(sc.nextInt()){
					case 1:
						System.out.println("Enter the Name, Price, Quantity");
						Grocery item = addNewItem(sc.next(), sc.nextInt(),sc.nextInt(), ItemsRecord);
						ItemsRecord.add(item); 
						System.out.println("Item added successfully");
					break;
					
					case 2:
						System.out.println("Enter Item Name");
						Grocery a = findByItemName(sc.next(), ItemsRecord);
						System.out.println("Enter new Quantity for updation");
						int newqty = sc.nextInt();
						validateQty(newqty);
						a.setQty(newqty);
						a.setStockUpdate(LocalDateTime.now());
						System.out.println("Item updated successfully\n"+a);
					break;
					
					case 3:
						System.out.println("All Grocery Items Listed Below:");
						ItemsRecord.forEach(i -> System.out.println(i));
					break;
					
					case 4:
						removeItem(ItemsRecord);
					break;
						
					case 5:
						System.out.println("Displaying Items updated in last 3 days");
						LocalDateTime threeDaysAgo = LocalDateTime.now().minusDays(3);
						ItemsRecord.stream().filter(i->i.getStockUpdate().isAfter(threeDaysAgo)).
						forEach(i->System.out.println(i+" Stock Update(Date-Time): "+i.getStockUpdate()));
					break;
					
					case 0:
						System.out.println("Enter File Name");
						storeData(ItemsRecord, sc.next());
						exit = true;
					}
				}
				catch(MyException | IOException e) {
					sc.nextLine();
					System.out.println(e);
					System.out.println("Please Retry !!!");
				}
			}
		}
	
	}

}
