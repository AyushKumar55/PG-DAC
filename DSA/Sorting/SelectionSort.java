package day1;

import java.util.Arrays;

public class SelectionSort {
	
	//Selection Sort Algorithm
	public static int[] selectionSort(int[] arr) {
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
//			System.out.println(Arrays.toString(arr)); for printing after each iteration
		}
		return arr;
	}
	
	public static void main(String[] args) {
		
		int[] arr = {34, 56, 76, 88, 45, 90, 81, 99};
		
		
		System.out.println("Selection Sort");
		System.out.println("Before Sorting: "+Arrays.toString(arr));
		arr = selectionSort(arr);
		System.out.println("After Sorting: "+Arrays.toString(arr));
		
	}

}