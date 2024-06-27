import java.util.Arrays;
import java.util.Scanner;

public class RecursiveBinarySearch {

	public static int recBinarySearch(int[] arr, int left, int right, int key) {
		if(right < left)
			return -1;
		int index, mid = (left + right)/2;
		if(key == arr[mid])
			return mid;
		if(key < arr[mid])
			index = recBinarySearch(arr, left, mid-1, key);
		else
			index = recBinarySearch(arr, mid+1, right, key);
		return index;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = {34, 56, 76, 88, 45, 90, 81, 99};
		Arrays.sort(arr); // binary search only works for sorted array
		// After sorting - {34, 45, 56, 76, 81, 88, 90, 99} <-- consider this for verification
		
		System.out.print("Enter key to search: ");
		int key = sc.nextInt();
		int index = recBinarySearch(arr, 0, arr.length-1, key);
		
		if(index != -1)
			System.out.println("Key found at index: "+index);
		else
			System.out.println("Key not found.");
		
		sc.close();
	}
}
