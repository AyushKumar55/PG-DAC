package com.tester;
import com.developers.*;
import java.util.Scanner;
public class TestStacks {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice  = 0;
		Stack s = null;
		do {
			System.out.println("Press 1 to choose FixedStack\n"
				+ "Press 2 to choose Growable Stack\n"
				+ "Press 3 to Push Data\n"
				+ "Press 4 to Pop Data\n"
				+ "Press 5 to Display the Stack\n"
				+ "Press 6 to Exit");
			choice = sc.nextInt();
			switch(choice) {
			case 1: 
				System.out.println("Fixed Stack Choosen\n");
				s = new FixedStack();
				break;
			case 2:
				System.out.println("Growable Stack Choosen\n");
				s = new GrowableStack();
				break;
			case 3:
				s.push();
				break;
				
			case 4:
				s.pop();
				break;
				
			case 5:
				s.display();
				break;
				
			case 6:
				System.out.println("Thank You !!! Terminating the application...");
				break;
				
			default:
				System.out.println("Invalid Choice");
				break;
			}
		}while(choice!=6);
		sc.close();
		
	}
}