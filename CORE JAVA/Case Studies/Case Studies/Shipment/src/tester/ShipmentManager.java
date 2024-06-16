package tester;

import static utils.ShipmentUtils.addItems;
import static utils.ShipmentUtils.sortnStoreByCode;
import static utils.ShipmentUtils.sortnStoreByPrice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import core.Items;

public class ShipmentManager {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			Map<String, Items> mapShipment = new HashMap<>();

			boolean exit = false;
			while (!exit) {
				System.out.println("Options:\n" + "1. Store Item Details.\n" + "2. Sort by Item Price and Store Data.\n"
						+ "3. Sort by Item Price and Store Data.\n" + "0. Exit");

				try {
					switch (sc.nextInt()) {
					case 1:
						int count = 1;
						System.out.println("Enter no. of Item's Data you want to feed");
						int num = sc.nextInt();
						for(int i = 0; i < num; i++) {
							System.out.println("Item No.: "+count++);
							addItems(mapShipment, sc);
						}
						System.out.println("Data Stored Successfully");
						break;
						
					case 2:
						sortnStoreByCode(mapShipment);
						break;
						
					case 3:
						sortnStoreByPrice(mapShipment);
						break;
						
					case 0:
						exit = true;
						System.out.println("Thanks !!!");
						
					}
				}
				catch(Exception e) {
					sc.nextLine();
					System.out.println("Error: " + e);
					System.out.println("Please Retry !!!");
				}
			}
		}
	}
}
