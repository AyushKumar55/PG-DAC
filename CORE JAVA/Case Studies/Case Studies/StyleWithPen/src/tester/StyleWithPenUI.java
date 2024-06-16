package tester;

import static utils.PenUtils.addNewPen;
import static utils.PenUtils.populateMap;
import static utils.PenUtils.removePens;
import static utils.PenUtils.setDiscount;
import static utils.PenUtils.updatePen;
import static IOUtils.IOUtils.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import core.Pen;

public class StyleWithPenUI {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			Map<Integer, Pen> penMap = new HashMap<>();
			populateMap(penMap);

			boolean exit = false;
			while (!exit) {
				System.out.println("Options:\n" + "1. Add a new Pen\n" + "2. Update stock of a Pen\n"
						+ "3. Set discount of 20% for all the pens which are not at all sold in last 3 months\n"
						+ "4. Remove Pens which are never sold once listed in 9 months\n"
						+ "5. Check stored data from a file\n"
						+ "0. Store Data and Exit");
				try {
					switch (sc.nextInt()) {
					case 1:
						addNewPen(penMap, sc);
						break;

					case 2:
						updatePen(penMap, sc);
						break;

					case 3:
						setDiscount(penMap);
						break;
						
					case 4:
						removePens(penMap);
						break;
						
					case 5:
						System.out.println("Enter file name");
						readFromFile(sc.next());
						break;
						
					case 0:
						System.out.println("Enter file name for storing data");
						storeData(penMap, sc.next());
						exit = true;
						break;
						
					default:
						System.out.println("Invalid Choice");		
					}
				} catch (Exception e) {
					sc.nextLine();
					System.out.println("Error: " + e);
					System.out.println("Please Retry");
				}
			}
		}
	}
}
