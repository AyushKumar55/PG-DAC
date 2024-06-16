package com.developers;

//import java.util.Arrays;
import java.util.Scanner;

public class GrowableStack implements Stack {

	Scanner sc = new Scanner(System.in);

	int length = STACK_SIZE;
	Customer[] cs = new Customer[length];

	int top = -1;

	private boolean isFull() {
		if ((top + 1) == length) {
			return true;
		} else
			return false;
	}

	@Override
	public void push() {
		System.out.println("Enter the Customer details\n");

		if (isFull()) {
			
			length *= 2;

			Customer[] temp = new Customer[cs.length];

			for (int i = 0; i < cs.length; i++) {
				temp[i] = cs[i];
			}

			cs = new Customer[length];

			for (int i = 0; i < length; i++) {
				if (i < temp.length) {
					cs[i] = temp[i];
				}
			}
			cs[top] = new Customer(sc.nextInt(), sc.next(), sc.nextLine());
			top++;
			

		} else {
			cs[top+1] = new Customer(sc.nextInt(), sc.next(), sc.nextLine());
			top++;
		}
	}

	@Override
	public void pop() {
		if (top < 0) {
			System.out.println("Stack is EMPTY !!!");
		} else
		cs[top--] = null;
		//System.out.println("Deleted Element :"+cs[top].toString());
		//top--;
	}

	@Override
	public void display() {
		System.out.println("Customer Details:\n");
		//System.out.println(Arrays.toString(cs));
		for (Customer p : cs) {
			if (p != null) {
				System.out.println(p);
			}
		}

	}

}
