package com.tester;

import java.util.Scanner;

import com.developers.geometry.Point2D;

public class TestPoints {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many points do you want to plot?");
		int size = sc.nextInt();
		Point2D[] point = new Point2D[size];
		int choice=0;
		do {
			System.out.println("Press 1 to enter coordinates x,y");
			System.out.println("Press 2 to display all the entered coordinates");
			System.out.println("Press 0 to exit");
			int index=0;
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.print("Enter index : ");
				index=sc.nextInt();
				if (index>size || index<0) 
					System.out.println("Index less than or out of bound !!!");
				else if(point[index]==null) {
					System.out.println("Enter the coordinate Point");
					point[index] = new Point2D(sc.nextInt(), sc.nextInt());
				}
				else
					System.out.println("The index already has a Coordinate Point");
				break;
				
			case 2:
				for(Point2D p : point)
				{
					if(p!=null)
						System.out.println(p.show());
					else
						System.out.println("null");
				}
				break;
			}
		}while(choice!=0);
		sc.close();
	}
}
