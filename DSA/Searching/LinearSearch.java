package day1;

import java.util.Scanner;

public class LinearSearch {
	
	//linear search algorithm
	public static int linearSearch(int[] arr, int key) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == key) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = {34, 56, 76, 88, 45, 90, 81, 99};
		
		System.out.print("Enter key to search: ");
		int key = sc.nextInt();
		int index = linearSearch(arr, key);
		
		if(index != -1)
			System.out.println("Key found at index: "+index);
		else
			System.out.println("Key not found.");
		
		sc.close();
	}
}
