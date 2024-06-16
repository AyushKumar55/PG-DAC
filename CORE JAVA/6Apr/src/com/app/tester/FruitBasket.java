package com.app.tester;

import com.app.fruits.*;
import java.util.Scanner;

public class FruitBasket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the quantity of fruits you want");
		Fruit[] fruitBasket=new Fruit[sc.nextInt()];
		int flag=0, choice = 0;
		do{
			System.out.println("Welcome to Fruitify\n"
					+ "Press 1 to ADD a MANGO\n"
					+ "Press 2 to ADD an ORANGE\n"
					+ "Press 3 to ADD an APPLE\n"
					+ "Press 4 to DISPLAY your BASKET\n"
					+ "Press 5 to DISPLAY ALL FRESH FRUITS\n"
					+ "Press 6 to MARK A FRUIT AS STALE(NOT FRESH)\n"
					+ "Press 7 to MARK ALL SOUR FRUITS AS STALE(NOT FRESH)"
					+ "Press 7 to ENJOY OUR SPECIALITIES\n"
					+ "Press 8 to EXIT");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1: 
				if(flag < fruitBasket.length) {
					System.out.println("Enter Weight and Color of the fruit");
					fruitBasket[flag] = new Mango("Mango", sc.nextDouble(), 
							sc.next(), true);
					flag++;
				}
				else {
					System.out.println("Fruit Basket is Full !!!");
				}
				break;
				
			case 2: 
				if(flag < fruitBasket.length) {
					System.out.println("Enter WeighT and Color");
					fruitBasket[flag] = new Orange("Orange",sc.nextDouble(), 
							sc.next(), true);
					flag++;
				}
				else {
					System.out.println("Fruit Basket is Full !!!");
				}
				break;
				
			case 3: 
				if(flag < fruitBasket.length) {
					System.out.println("Enter Weight and Color");
					fruitBasket[flag] = new Apple("Apple",sc.nextDouble(), 
							sc.next(), true);
					flag++;
				}
				else {
					System.out.println("Fruit Basket is Full !!!");
				}
				break;
			case 4:
				System.out.println("Fruits in your Basket:");
				for( Fruit f : fruitBasket) {
					if(f!=null)
						System.out.println(f.getName());
					else
						break;
				}
				break;
				
			case 5:
				System.out.println("Fresh Fruits (if any)");
				for( Fruit f : fruitBasket) {
					if(f!=null && f.getState()==true)
						System.out.println(f+" Taste: "+f.taste());
				}
				break;
				
			case 6:
				System.out.println("Wanna Mark the Fruit Stale(Not Fresh)? Enter the Index no.");
				int index  = sc.nextInt()-1;
				if(fruitBasket[index].getState()!=true && index < fruitBasket.length && index >= 0) {
					fruitBasket[index].setState();
					System.out.println("Fruit Marked Stale");
				}
				break;
			
			case 7:
				System.out.println("Wanna Mark All Sour Fruits as Stale(Not Fresh)?\n");
				for(Fruit f : fruitBasket) {
					if(f!=null && f.taste().equals("Sour")) {
						f.setState();
						System.out.println("Not fresh: "+f.getName());
					}
				}
				break;
			
			case 8:
				System.out.println("Wanna enjoy our speciality? Enter the index no.");
				index = sc.nextInt() - 1;
				Fruit f = fruitBasket[index];
				if(f instanceof Mango)
					((Mango)f).pulp();
				else if( f instanceof Orange)
					((Orange)f).juice();
				else
					((Apple)f).jam();
				break;
			case 9:
				System.out.println("Thank You !!!");
				break;
				
			default:
				System.out.println("Invalid Choice");
			}		
		}while(choice!=8);
		sc.close();
	}
}