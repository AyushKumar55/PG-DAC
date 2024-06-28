package day5;

import java.util.Scanner;

class Queue {
	private int[] arr;
	private int rear, front;

	Queue(int size) {
		arr = new int[size];
		front = -1;
		rear = -1;
	}

	public boolean isFull() {
	    return rear == arr.length - 1;
	}

	public boolean isEmpty() {
		return front == rear;
	}

	public void push(int val) {
		if (isFull())
			throw new RuntimeException("Queue is Full");
		rear++;
		arr[rear] = val;
	}

	public int pop() {
		if (isEmpty())
			throw new RuntimeException("Queue is Empty");
		front++;
		return arr[front];
	}

	public int peek() {
		if (isEmpty())
			throw new RuntimeException("Queue is Empty");
		return arr[front + 1];
	}
	
	public void display() {
		System.out.print("Queue: ");
		for(int i = front+1; i <= rear; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}

public class LinearQueue {

	public static void main(String[] args) {

		Queue q = new Queue(5);
		Scanner sc = new Scanner(System.in);
		boolean exit = false;

		do {
			System.out.println("Press:\n" + "0. Exit\n" + "1. Push\n" + "2. Pop\n" + "3. Peek\n"
					+ "4. Display");
			switch (sc.nextInt()) {
		case 1:
			System.out.print("Enter value to push: ");
				try {
					q.push(sc.nextInt());
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			break;
			
		case 2:
				int val;
				try {
					val = q.pop();
					System.out.println("Popped: "+val);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			break;

		case 3:
				try {
					int peek = q.peek();
					System.out.println("Peek: "+peek);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			break;
			
		case 4:
			q.display();
			break;

			case 0:
				exit = true;
				break;

			default:
				System.out.println("Invalid Choice");
				break;
			}
		} while (!exit);
		sc.close();
	}
}
