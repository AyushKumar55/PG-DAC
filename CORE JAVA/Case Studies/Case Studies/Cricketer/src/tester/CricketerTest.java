package tester;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import core.Cricketer;
import static utils.CricketerUtils.*;

public class CricketerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner sc = new Scanner(System.in)) {

			Map<String, Cricketer> CricketMap = new HashMap<>();
			populateMap(CricketMap);

			boolean exit = false;
			while (!exit) {
				System.out.println("Options\n" + "1. Add Cricekters into your data\n" + "2. Modify Cricketer's Rating\n"
						+ "3. Search Cricketer by name\n" + "4. View All Cricketers in your data\n"
						+ "5. View All Cricketers sorted by Rating\n" + "0. Exit");
				try {
					switch (sc.nextInt()) {
					case 1:
						System.out.println("Enter no. of Cricketer's Data you want to feed");
						int num = sc.nextInt();
						for(int i = 0; i < num; i++)
							addCricketers(CricketMap, sc);
						break;
						
					case 2:
						ModifyRating(CricketMap, sc);
						break;
						
					case 3:
						SearchByName(CricketMap, sc);
						break;
						
					case 4:
						DisplayAll(CricketMap);
						break;
						
					case 5:
						SortByRaitng(CricketMap);
						break;
						
					case 0:
						exit = true;
						System.out.println("Enter a filename to serialize data");
						serialize(CricketMap, sc.next());
						System.out.println("Enter a filename to deserialize data");
						Object details = deserialize(CricketMap, sc.next());
						//System.out.println(details.getClass());
						System.out.println(details);
						System.out.println("Thanks !!!");
						break;
						
					default:
						System.out.println("Invalid Choice");
					}
				} catch (Exception e) {
					sc.nextLine();
					System.out.println("Error: "+ e);
					System.out.println("Please Retry !!!");
				}
			}

		}
	}

}
