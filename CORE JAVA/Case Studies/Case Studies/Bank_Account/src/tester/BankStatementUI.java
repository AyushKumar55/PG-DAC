package tester;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import core.BankStatement;

public class BankStatementUI {
	public static void main(String[] args) throws FileNotFoundException, IOException {

		try (Scanner sc = new Scanner(System.in)) {
			List<BankStatement> statement = new ArrayList<>();

			try (BufferedReader br = new BufferedReader(new FileReader("Jan2023.txt"))) {
				while (br.ready()) {
					String[] arrays = br.readLine().split(",");

					statement.add(new BankStatement(arrays[0], arrays[1], Double.parseDouble(arrays[2]),
							Double.parseDouble(arrays[3])));
				}
				//statement.forEach(p -> System.out.println(p));
			}

			boolean exit = false;
			while (!exit) {
				System.out.println("Options\n" + "1. View Sum of All Deposits\n" + "2. View Maximum Deposit Amount\n"
						+ "3. View Shopping Expenses\n" + "4. View Date on which maximum amount withdrawn\n"
						+ "5. Exit");
				try {
					switch (sc.nextInt()) {
					case 1:
						System.out.println("Sum of All Deposits = "
								+ statement.stream().mapToDouble(e -> e.getDepositAmount()).sum());
						break;

					case 2:
						System.out.println("Max Deposit amount = "
								+ statement.stream().mapToDouble(e -> e.getDepositAmount()).max().orElseThrow());
						break;

					case 3:
						System.out.println("Total Shopping Expenses = "
								+ statement.stream().filter(e -> e.getNarration().equals("Shopping"))
										.mapToDouble(e -> e.getWithdrawlAmount()).sum());
						break;
						
					case 4:
						System.out.print("Date on which max amount withdrawn = ");
						double maxWithdrawl = statement.stream().mapToDouble(e -> e.getWithdrawlAmount()).max()
								.orElseThrow();
						statement.stream().filter(e -> e.getWithdrawlAmount() == maxWithdrawl)
								.forEach(s -> System.out.println(s.getTransactionDate()));
						break;
						
					case 5:
						exit = true;
						System.out.println("Thank You !!!");
						break;
						
					default:
						System.out.println("Invalid Choice");
							
					}
				} catch (Exception e) {
					sc.nextLine();
					System.out.println("Error: " + e);
					System.out.println("Please Retry!!!");
				}
			}

		}
	}

}
