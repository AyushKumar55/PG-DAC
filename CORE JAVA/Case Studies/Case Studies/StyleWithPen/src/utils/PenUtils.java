package utils;

import static core.Brands.CELLO;
import static core.Brands.FLAIR;
import static core.Brands.HAUSER;
import static core.Brands.PARKER;
import static core.Brands.REYNOLDS;
import static core.Material.ALLOY_METAL;
import static core.Material.FIBER;
import static core.Material.METAL;
import static core.Material.PLASTIC;
import static java.time.LocalDate.parse;

import java.time.LocalDate;
import java.util.Map;
import java.util.Scanner;

import core.Brands;
import core.Material;
import core.Pen;
import custom_exception.MyException;

public class PenUtils {
	public static void populateMap(Map<Integer, Pen> penMap) {
		penMap.put(1, new Pen(REYNOLDS, 25, "Black", "Blue", PLASTIC, 100, parse("2024-03-25"), parse("2023-01-23")));
		penMap.put(2, new Pen(FLAIR, 40, "Red", "Black", FIBER, 200, parse("2024-04-26"), parse("2024-02-23")));
		penMap.put(3, new Pen(HAUSER, 50, "Purple", "Red", METAL, 100, parse("2024-02-25"), parse("2022-05-23")));
		penMap.put(4, new Pen(PARKER, 150, "Blue", "Green", ALLOY_METAL, 70, parse("2024-01-10"), parse("2023-11-23")));
		penMap.put(5, new Pen(CELLO, 10, "Green", "Blue", PLASTIC, 250, parse("2024-04-25"), parse("2024-01-20")));
	}

	public static void addNewPen(Map<Integer, Pen> penMap, Scanner sc) {
		System.out.println("Enter Brand Name");
		String brand = sc.next().toUpperCase();
		System.out.println("Enter it's Price");
		double price = sc.nextDouble();
		System.out.println("Enter it's Color");
		String color = sc.next();
		System.out.println("Enter it's Ink Color");
		String inkColor = sc.next();
		System.out.println("Enter it's Material");
		String material = sc.next().toUpperCase();
		System.out.println("Enter it's Quantity");
		int qty = sc.nextInt();

		Pen p = new Pen(Brands.valueOf(brand), price, color, inkColor, Material.valueOf(material), qty, LocalDate.now(),
				LocalDate.now());
		penMap.put(p.getId(), p);
	}

	public static void updatePen(Map<Integer, Pen> penMap, Scanner sc) throws MyException {
		System.out.println("Enter Id of Pen");
		int id = sc.nextInt();
		if (penMap.containsKey(id)) {
			Pen p1 = penMap.get(id);
			System.out.println("Enter Brand Name");
			p1.setBrand(Brands.valueOf(sc.next().toUpperCase()));
			System.out.println("Enter it's Color");
			p1.setColor(sc.next());
			System.out.println("Enter it's Ink Color");
			p1.setInkColor(sc.next());
			System.out.println("Enter it's Material");
			p1.setMaterial(Material.valueOf(sc.next().toUpperCase()));
			System.out.println("Enter it's Quantity");
			p1.setStock(sc.nextInt());
			p1.setStockUpdateDate(LocalDate.now());
			System.out.println("Data Updated Successfully:\n" + p1);
		} else
			throw new MyException("Pen does not Exist");
	}

	public static void setDiscount(Map<Integer, Pen> penMap) {
		LocalDate lastThreeMonths = LocalDate.now().minusMonths(3);
		penMap.values().stream().filter(p -> p.getStockUpdateDate().isBefore(lastThreeMonths)).forEach(p -> {
			p.setDiscounts(20);
			p.setPrice(p.getPrice() * 0.8);
			System.out.println("After Discount: " + p);
		});
	}

	public static void removePens(Map<Integer, Pen> penMap) {
		penMap.values().removeIf(p -> p.getStockListingDate().isBefore(LocalDate.now().minusMonths(9)));
		penMap.forEach((k, v) -> System.out
				.println("After Removing Pens which were never sold once listed in 9 months\n" + v));
	}

}
