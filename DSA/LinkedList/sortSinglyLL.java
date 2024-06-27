import java.util.Scanner;

class SinglyList {
	static class Node {
		// Node class fields
		private int data;
		private Node next;

		// Node class methods
		public Node() {
			data = 0;
			next = null;
		}

		public Node(int val) {
			data = val;
			next = null;
		}
	}

	// List class fields
	private Node head;

	public SinglyList() {
		head = null;
	}

	public void addFirst(int val) {
		// create new node and init it
		Node newNode = new Node(val);
		// add node at the first
		newNode.next = head;
		head = newNode;
	}

	public void addLast(int val) {
		// create new node and init it
		Node newNode = new Node(val);
		// special case 1: if list is empty, make new node as first node of list
		if (head == null) {
			head = newNode;
		}
		// general case: add node at the end
		else {
			// traverse till the last node
			Node trav = head;
			while (trav.next != null) {
				trav = trav.next;
			}
			// add next node after trav(trav.next)
			trav.next = newNode;
		}
	}

	public void display() {
		Node trav = head;
		System.out.print("List: ");
		//traverse to the last node
		while (trav != null) {
			System.out.print(trav.data + " ");
			trav = trav.next;
		}
		System.out.println("");
	}

	public void sort() {
		// Algorithm - Selection sort
		Node i, j;
		for (i = head; i.next != null; i = i.next) {
			for (j = i.next; j != null; j = j.next) {
				if (i.data > j.data) {
					int temp = i.data;
					i.data = j.data;
					j.data = temp;
				}
			}
		}
		display();
	}
}

public class sortSinglyLL {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		SinglyList list = new SinglyList();

		// add nodes
		list.addFirst(20);
		list.addLast(12);
		list.addLast(56);
		list.addLast(43);
		list.addLast(78);
		list.addFirst(90);
		list.addLast(69);

		System.out.println("Before Sorting:-");
		list.display();

		System.out.println("After Sorting:- ");
		list.sort();

		sc.close();
	}
}
