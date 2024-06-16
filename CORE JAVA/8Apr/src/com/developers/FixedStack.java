package com.developers;

import java.util.Scanner;

public class FixedStack implements Stack{

	Scanner sc = new Scanner(System.in);
	
	Customer[] cs = new Customer[STACK_SIZE];
	int top = -1;

	@Override
	public void push() {
		if(top<STACK_SIZE-1) {
			System.out.println("Enter the Customer details\n");
			top++;
			cs[top] = new Customer(sc.nextInt(),sc.next(),sc.nextLine());
			System.out.println("Customer details added successfully !!!");
		}
		else
			System.out.println("Stack is FULL");
	}

	@Override
	public void pop() {
		cs[top] = null;
		top--;
	}
	
	public void display() {
		System.out.println("Customer Details:\n");
		for(Customer p : cs) {
			if(p != null)
			{
			System.out.println(p);
			}
		}
	}
}
