package stack;

import java.util.Scanner;

public class StackOperations<T> implements Stack<T> {
	public T[] arr = (T[])new Object[10];
	public int top = -1;

	public void resizeArray() {
		T[] newArr = (T[]) new Object[arr.length * 2];
		for (int i = 0; i < arr.length; i++) {
			newArr[i] = arr[i];
		}
		arr = newArr;
	}

	public boolean isFull() {
		if (top == arr.length - 1) {
			return true;
		} else
			return false;
	}

	public void push(T element) {
		if (isFull()) {
			resizeArray();
		}
		++top;
		arr[top] = element;
	}

	public boolean isEmpty() {
		if (top == -1) {
			return true;
		} else
			return false;
	}

	public void pop() throws StackUnderflowException {
		if (isEmpty()) {
			throw new StackUnderflowException("Stack is Empty");
		}
		System.out.println("Element " + arr[top] + " deleted");
		--top;
	}

	public void peek() {
		System.out.println("Top Element - " + arr[top]);
	}

	public void displayArr() {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			StackOperations<Object> stack = new StackOperations<Object>();

			boolean exit = false;
			do {
				System.out.println("Press:\n" + "1. Push an Element\n" + "2. Pop an Element\n"
						+ "3. Peek onto the Top Element\n" + "4. Check if Stack is Empty\n"
						+ "5. Check if Stack is Full\n" + "6. View All Elements\n" + "7. Exit");
				switch (sc.nextInt()) {
				case 1:
					System.out.println("Enter the element you want to PUSH");
					Object pushElement = sc.next();
					stack.push(pushElement);
					break;

				case 2:
					try {
						stack.pop();
					} catch (Exception e) {
						System.out.println(e);
					}
					break;

				case 3:
					stack.peek();
					break;

				case 4:
					stack.isEmpty();
					System.out.println("Stack is Empty");
					break;

				case 5:
					stack.isFull();
					System.out.println("Stack is Full");
					break;

				case 6:
					stack.displayArr();
					break;

				case 7:
					exit = true;
					break;
					

				default:
					System.out.println("Invalid Choice");
					break;
				}
			} while (!exit);
		}
	}
}