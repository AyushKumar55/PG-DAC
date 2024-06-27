import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static int binarySearch(int[] arr, int key) {
		int left = 0, right = arr.length - 1, mid;
		
		//binary search algorithm
		while(left <= right) {
			
			mid = (left+right)/2; //middle
			
			if(arr[mid] == key) {
				return mid;
			}
			if(arr[mid] > key) {
				right = mid - 1; //focus on left part
			}
			else
				left = mid + 1; //focus on right part
		}
		return -1;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = {34, 56, 76, 88, 45, 90, 81, 99};
		Arrays.sort(arr); // binary search only works for sorted array
		// After sorting - {34, 45, 56, 76, 81, 88, 90, 99}
		
		System.out.print("Enter key to search: ");
		int key = sc.nextInt();
		int index = binarySearch(arr, key);
		
		if(index != -1)
			System.out.println("Key found at index: "+index);
		else
			System.out.println("Key not found.");
		
		sc.close();
	}
}
