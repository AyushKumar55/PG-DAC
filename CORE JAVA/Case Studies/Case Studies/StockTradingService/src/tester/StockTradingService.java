package tester;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import static utils.StockUtils.*;
import static io.IOUtils.saveStock;

import core.Stock;

public class StockTradingService {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			
			Map<String, Stock> mapStock = new HashMap<>();
			populateMap(mapStock);
			
			boolean exit = false;
			while(!exit) {
				System.out.println("Options\n"
						+ "1. Add New Stocks in the Market\n"
						+ "2. View Available Stocks by Company\n"
						+ "3. Buy Stocks\n"
						+ "4. Sell Stocks\n"
						+ "5. Save and Exit\n");
				
				try {
					switch(sc.nextInt()) {
					case 1:
						addStock(mapStock, sc);
						break;
						
					case 2:
						displayStockByCompany(mapStock, sc);
						break;
						
					case 3:
						buyStock(mapStock, sc);
						break;
						
					case 4:
						sellStock(mapStock, sc);
						break;
						
					case 5:
						System.out.println("Enter File Name");
						String filename = sc.next();
						saveStock(mapStock, filename);
						exit = true;
						System.out.println("Data Saved");
						System.out.println("Thank You !");
					}
				}
				catch(Exception e) {
					sc.nextLine();
					System.out.println("Error: "+e);
					System.out.println("Please Retry !!");
				}
			}
		}

	}

}
