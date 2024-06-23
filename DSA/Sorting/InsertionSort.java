package day2;

import java.util.Arrays;

public class InsertionSort {

	public static void insertionSort(int[] arr) { 
		// n-1 passes: in each consider ith element as last element of array
		for (int i = 1; i < arr.length; i++) {
			// copy last element into temp var
			int j, temp = arr[i];
			// compare temp with all elements before that, find appropriate position for the
			// element and insert temp at that position
			//below loop can be considered for simple insertion
			for (j = i - 1; j >= 0 && arr[j] > temp; j--) {
				arr[j+1] = arr[j];
			}
			arr[j+1] = temp;
		}
	}

	public static void main(String[] args) {
		int[] arr = { 22, 54, 12, 9, 78, 89, 32, 50, 67 };
		// int[] arr = {11, 12, 13, 14, 15}; already sorted array will result to only
		// n-1 iteration.

		System.out.println("Before Sorting: " + Arrays.toString(arr));

		insertionSort(arr);
		System.out.println("After Sorting: " + Arrays.toString(arr));

	}
}
