package utils;

import static java.time.LocalDate.parse;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;

import core.Items;

public class ShipmentUtils {
	
	public static void addItems(Map<String, Items> mapShipment, Scanner sc) {
		sc.nextLine();
		System.out.print("Enter Item Code: ");
		String code = sc.nextLine();
		System.out.print("Enter Item Description: ");
		String desc = sc.nextLine();
		System.out.print("Enter Price: ");
		double price = sc.nextDouble();
		System.out.print("Enter Shipment Date(yyyy-mm-dd): ");
		String date = sc.next();
		
		Items i = new Items(code, desc, price, parse(date));
		mapShipment.put(i.getCode(), i);
	}
	
	public static void sortnStoreByCode(Map<String, Items> mapShipment) throws FileNotFoundException, IOException {
		Comparator<Items> comp = (i1,i2) -> i1.getCode().compareTo(i2.getCode());
		System.out.println("Sorted by Item Code");
		mapShipment.values().stream().sorted(comp).forEach(i->System.out.println(i));
		
		try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("items_code.ser"))){
			out.writeObject(mapShipment);
		}
	}
	
	public static void sortnStoreByPrice(Map<String, Items> mapShipment)throws FileNotFoundException, IOException {
		Comparator<Items> comp = (i1,i2) -> ((Double)i1.getPrice()).compareTo(i2.getPrice());
		System.out.println("Sorted by Item Price");
		mapShipment.values().stream().sorted(comp).forEach(i->System.out.println(i));
	
		try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("items_price.ser"))){
			out.writeObject(mapShipment);
		}
	}
	
	

}
