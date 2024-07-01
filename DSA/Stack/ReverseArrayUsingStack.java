package day5;

import java.util.Arrays;
import java.util.Stack;

public class ReverseArrayUsingStack {

	public static void main(String[] args) {

		int[] arr = {1, 2, 3, 4, 5};
		Stack<Integer> s = new Stack<>();
		
		System.out.println("Before Reverse: "+Arrays.toString(arr));
		for(int i = 0; i < arr.length; i++) {
			s.push(arr[i]);
		}
		for(int i = 0; i < arr.length; i++) {
			arr[i] = s.pop();
		}
		System.out.println("After Reverse: "+Arrays.toString(arr));
	}
}
