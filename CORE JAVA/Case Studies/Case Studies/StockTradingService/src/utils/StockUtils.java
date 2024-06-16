package utils;

import static java.time.LocalDate.parse;
import static utils.Validations.checkDupId;
import static utils.Validations.validateClosingDate;
import static utils.Validations.validateCompany;
import static utils.Validations.validateQty;
import static utils.Validations.validateStockId;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

import core.Stock;
import custom_exception.MyException;

public class StockUtils {
	
	public static void populateMap(Map<String,Stock> mapStock) {
		mapStock.put("TM", new Stock("TM", "Tata Motors", "Tata Group", 4500.00, parse("2024-04-29"), 100));
		mapStock.put("AAPL", new Stock("AAPL", "Apple Inc.", "Apple", 3750.30, parse("2024-04-30"), 50));
		mapStock.put("TSLA", new Stock("TSLA", "Tesla Inc.", "Tesla", 5000.00, parse("2024-04-29"), 200));
		mapStock.put("GOOG", new Stock("GOOG", "Alphabet Inc.", "Google", 2800.00, parse("2024-04-30"), 100));
		mapStock.put("TP", new Stock("TP", "Tata Power", "Tata Group", 880.00, parse("2024-05-29"), 400));
		mapStock.put("MSFT", new Stock("MSFT", "Microsoft Corporation", "Microsoft", 3090.50, parse("2024-04-30"), 150));
		mapStock.put("AMZN", new Stock("AMZN", "Amazon.com", "Amazon", 3500.00, parse("2024-04-29"), 75));
		mapStock.put("FB", new Stock("FB", "Facebook", "Meta Platforms Inc.", 2000.10, parse("2024-05-01"), 225));
		mapStock.put("TS", new Stock("TS", "Tata Steel", "Tata Group", 8900.00, parse("2024-04-30"), 400));
		mapStock.put("TCS", new Stock("TCS", "Tata Consultancy Services", "Tata Group", 5500.00, parse("2024-05-01"), 500));
		mapStock.put("X", new Stock("X", "Twitter", "Meta Platforms Inc.", 3450.90, parse("2024-05-29"), 500));
		mapStock.put("IG", new Stock("IG", "Instagram", "Meta Platforms Inc.", 4000.10, parse("2024-05-30"), 400));
		
		mapStock.forEach((k,v)->System.out.println(v));
	}
	
	public static void addStock(Map<String,Stock> mapStock, Scanner sc) throws MyException {
		System.out.println("Enter Stock Id");
		String id = sc.next();
		checkDupId(mapStock, id);
		
		System.out.println("Enter Stock Name");
		String stockName = sc.next();
		
		sc.nextLine();
		System.out.println("Enter Company Name");
		String companyName = sc.next();
		
		System.out.println("Enter Price");
		double price = sc.nextDouble();
		
		System.out.println("Enter Closing Date");
		LocalDate closingDate = parse(sc.next());
		validateClosingDate(closingDate);
		
		System.out.println("Enter Available Quantity");
		int qty = sc.nextInt();
		validateQty(mapStock,qty);
		
		Stock s = new Stock(id, stockName, companyName, price, closingDate,  qty);
		mapStock.put(id, s);
		System.out.println("Stock Added Successfully");
	}
	
	public static void displayStockByCompany(Map<String,Stock> mapStock, Scanner sc) throws MyException {
		sc.nextLine();
		System.out.println("Enter Company Name");
		String name = sc.nextLine();
		validateCompany(mapStock, name);
		
		System.out.println("Stocks Listed By "+name+" : ");
		mapStock.values().stream().filter(s->s.getCompany_name().equals(name)).forEach(s->System.out.println(s.getStock_name()));
	}
	
	public static void buyStock(Map<String,Stock> mapStock, Scanner sc) throws MyException{
		System.out.println("Enter Stock Id");
		String id = sc.next();
		validateStockId(mapStock, id);
		System.out.println("Enter Quantity");
		int qty = sc.nextInt();
		validateQty(mapStock, id, qty);
		mapStock.values().stream().filter(s->s.getStock_id().equals(id)).forEach(s->s.setQty(s.getQty()-qty));
	}
	
	public static void sellStock(Map<String,Stock> mapStock, Scanner sc) throws MyException{
		System.out.println("Enter Stock Id");
		String id = sc.next();
		validateStockId(mapStock, id);
		System.out.println("Enter Quantity");
		int qty = sc.nextInt();
		validateQty(mapStock,qty);
		mapStock.values().stream().filter(s->s.getStock_id().equals(id)).forEach(s->s.setQty(s.getQty()+qty));	
	}
}
