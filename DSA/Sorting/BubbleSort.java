import java.util.Arrays;

public class BubbleSort {

	public static void bubbleSort(int[] arr) {
		//execute n-1 passes
		for(int i = 0; i < arr.length -1; i++) {
			boolean flag = false;
			for(int j = 0; j < arr.length-1-i; j++) {
				//compare consecutive elements
				//if left element is greater than right element, then swap them
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					flag = true;
				}
			}
			if(!flag)
				break;
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {22, 54, 12, 9, 78, 89, 32, 50, 67};
		//int[] arr = {11, 12, 13, 14, 15}; already sorted array will result to only n-1 iteration.
		
		System.out.println("Before Sorting: "+Arrays.toString(arr));
		
		bubbleSort(arr);
		System.out.println("After Sorting: "+Arrays.toString(arr));
		
	}
}
