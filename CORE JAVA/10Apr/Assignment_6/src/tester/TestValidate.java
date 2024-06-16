package tester;

import java.time.LocalDate;
import java.util.Scanner;
import static utils.VehicleValidationRules.*;

public class TestValidate {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int choice = 0;
			do {
				System.out.println("OPTIONS:-\n"
						+ "1. VALIDATE YOUR VEHICLE SPEED\n"
						+ "2. VALIDATE YOUR VEHICLE'S FUEL TYPE\n"
						+ "3. VALIDATE YOUR DRIVING LICENSE\n"
						+ "0. EXIT");
				choice = sc.nextInt();
				try {
				switch(choice) {
				case 1:
					System.out.print("Enter current speed: ");
					validateSpeed(sc.nextInt());
				break;
				
				case 2: 
					System.out.println("Enter your fuel type");
					validateFuelType(sc.next().toUpperCase());
				break;
				
				case 3:
					System.out.println("Enter your Expiry date of Driving Licence");
					validateDL(LocalDate.parse(sc.next()));
				break;
				
				case 0:
					System.out.println("THANK YOU !!! TERMINATING THE APP");
					break;
					
				default:
					System.out.println("INVALID CHOICE");
				}
				}
				catch (Exception e) {
					sc.nextLine();
					System.out.println(e);
				}
			}while(choice!=0);
		} 
	}
}
