package utils;

import static java.time.LocalDateTime.parse;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import core.Grocery;

public class GroceryUtils {

	public static void populateList(List<Grocery> list) {
		list.add(new Grocery("Potato", 25, 0, parse("2024-04-23T10:00:30")));
		list.add(new Grocery("Onion", 40, 10, parse("2024-04-22T09:25:40")));
		list.add(new Grocery("Garlic", 80, 30, parse("2024-04-21T09:20:10")));
		list.add(new Grocery("Cucumber", 20, 10, parse("2024-04-23T11:15:50")));
		list.add(new Grocery("Carrot", 25, 40, parse("2024-04-22T09:15:40")));
		list.add(new Grocery("Raddish", 20, 12, parse("2024-04-21T10:35:20")));
		list.add(new Grocery("Drumsticks", 40, 6, parse("2024-04-20T10:25:30")));
	}

	public static void removeItem(List<Grocery> items) {
		Iterator<Grocery> itr = items.iterator();
		boolean flag = false;
		while (itr.hasNext()) {
			Grocery g = itr.next();
			if (g.getQty() == 0) {
				System.out.println(g);
				itr.remove();
				System.out.println("Item Removed !!");
				flag = true;
			}
		}
		if (flag == false)
			System.out.println("Stock Available");
			
	}

	public static void storeData(List<Grocery> record, String fileName)  throws FileNotFoundException, IOException {
		try (PrintWriter pw = new PrintWriter(new FileWriter(fileName, true))) {
			pw.println("*****GROCERY ITEMS*****\n");
			for(Grocery g : record) {
				pw.write("Name: "+g.getName()+" Price: "+g.getPrice()+" Quantity: "+g.getQty()+
						" Stock Update(Date-Time): "+g.getStockUpdate()+"\n");
			}
			System.out.println("Data Exported Successfully");
		}
	}

//	public static Map<String, Grocery> populateMap(List<Grocery> GroceryList) {
//		Map<String, Grocery> mapItems = new HashMap<>();
//		GroceryList.forEach(p-> mapItems.put(p.getName(), p));
//		return mapItems;
//	}

}
