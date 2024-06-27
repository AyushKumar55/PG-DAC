package day4;

class SinglyLinkedList {
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

	public SinglyLinkedList() {
		head = null;
	}

	public void addLast(int val) {
		Node newNode = new Node(val);
		if (head == null)
			head = newNode;
		else {
			Node trav = head;
			while (trav.next != null)
				trav = trav.next;
			trav.next = newNode;
		}
	}

	public void display() {
		System.out.print("List: ");
		Node trav = head;
		while (trav != null) {
			System.out.print(trav.data + " -> ");
			trav = trav.next;
		}
		System.out.println();
	}

	public void reverse() {
		// consider current list as old and new list as empty
		Node oldhead = head;
		head = null;

		while (oldhead != null) {
			// delete first (temp) from old list
			Node temp = oldhead;
			oldhead = oldhead.next;

			// add first (temp) into new list
			temp.next = head;
			head = temp;
			//repeat until old list is finished
		}
	}
}

public class ReverseSinglyLinkedList {

	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();
		list.addLast(10);
		list.addLast(20);
		list.addLast(30);
		list.addLast(40);
		list.addLast(50);
		System.out.println("Before Reverse: ");
		list.display();
		list.reverse();
		System.out.println();
		System.out.println("After Reverse: ");
		list.display();
	}
}
