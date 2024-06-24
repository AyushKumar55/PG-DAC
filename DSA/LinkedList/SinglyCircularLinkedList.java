package day3;

import java.util.Scanner;

class SinglyCircularList {
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

	public SinglyCircularList() {
		head = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void display() {
		System.out.print("List: ");
		// special: list is empty
		if (isEmpty()) {
			return;
		}
		// general: print all nodes in the list
		Node trav = head;
		do {
			System.out.print(trav.data + " ");
			trav = trav.next;
		} while (trav != head);
		System.out.println();
	}

	public void addFirst(int val) {
		// create new node
		Node newNode = new Node(val);
		// special 1: if list is empty, newNode is the first node and make it circular
		if (head == null) {
			head = newNode;
			newNode.next = head;
		} else {
			// traverse till last node (trav), i.e. the node whose next contains head
			Node trav = head;
			while (trav.next != null) {
				trav = trav.next;
			}
			newNode.next = head; // newNode's next to head
			trav.next = newNode; // last node's (trav) next to newNode (i.e. now first node)
			head = newNode; // head to newNode
		}
	}

	public void addLast(int val) {

		// create new node
		Node newNode = new Node(val);
		// special 1: if list is empty, newNode is the first node and make it circular
		if (isEmpty()) {
			head = newNode;
			newNode.next = head;
		} else {
			// traverse till last node (trav), i.e. the node whose next contains head
			Node trav = head;
			while (trav.next != head)
				trav = trav.next;
			newNode.next = head; // newNode's next to head
			trav.next = newNode; // last node's (trav) next to newNode
		}
	}

	public void addAtPos(int val, int pos) {
		// create new node and init it
		Node newNode = new Node(val);
		// special 1: if list is empty, add node at the start
		// special 2: if pos<=1, add node at the start
		if (isEmpty() || pos < 1)
			addFirst(val);
		else {
			Node trav = head;
			// traverse till pos-1 (trav)
			for (int i = 1; i < pos - 1; i++) {
				// special 3: if pos > length of list, add node at the end
				if (trav.next == head)
					break;
				trav = trav.next;
			}
			// newNode's next should point to trav's next
			newNode.next = trav.next;
			// trav's next should point to newNode
			trav.next = newNode;
		}
	}

	public void deleteFirst() {
		// special 1: list is empty, throw exception
		if (isEmpty())
			throw new RuntimeException("List is Empty");
		// if list has one node, then make head null
		if (head.next == head)
			head = null;
		else {
			// traverse till last node (trav)
			Node trav = head;
			while (trav.next != null) {
				trav = trav.next;
			}
			// the last node (trav) next should point to new node
			trav.next = head;
			// take head to the next (2nd) node
			head = head.next;
		}
	}

	public void deleteLast() {
		// special 1: if list is empty
		if (isEmpty())
			throw new RuntimeException("List is empty");
		// special 2: if list has only one node
		if (head.next == head)
			head = null;
		else {
			// traverse till last node (trav), keep temp before trav
			Node temp = null, trav = head;
			while (trav.next != head) {
				temp = trav;
				trav = trav.next;
			}
			// making second last node point to head
			temp.next = head;
		}
	}

	public void deleteAtPos(int pos) {
		// special 1: if pos = 1
		if (pos == 1)
			deleteFirst();
		// special 2: if list is empty or pos < 1, then throw exception
		if (head == null || pos < 1)
			throw new RuntimeException("List is empty or Invalid Position.");
		// take temp pointer running behind trav
		Node temp = null, trav = head;
		// traverse till pos(trav)
		for (int i = 1; i < pos; i++) {
			// special 3: if pos is beyond list length, then throw exception
			if (trav.next == head)
				throw new RuntimeException("Invalid Position.");
			temp = trav;
			trav = trav.next;
		}
		// trav node is to be deleted and temp node is before that
		temp.next = trav.next;
		// trav node will be garbage collected
	}

	void deleteAll() {
		// Convert circular list into singly linked list
		head.next = null;
		// make head null
		head = null;

	}
}

public class SinglyCircularLinkedList {
	public static void main(String[] args) {
		SinglyCircularList list = new SinglyCircularList();
		Scanner sc = new Scanner(System.in);
		boolean exit = false;

		do {
			System.out.println("Press:\n" + "0. Exit\n" + "1. Display\n" + "2. Add First\n" + "3. Add Last\n"
					+ "4. Add at Position\n" + "5. Delete First\n" + "6. Delete Last\n" + "7. Delete at pos\n"
					+ "8. Delete All");
			switch (sc.nextInt()) {
			case 1:
				list.display();
				break;

			case 2:
				System.out.println("Enter Element");
				list.addFirst(sc.nextInt());
				break;

			case 3:
				System.out.println("Enter Element");
				list.addLast(sc.nextInt());
				break;

			case 4:
				System.out.println("Enter Element and Position");
				list.addAtPos(sc.nextInt(), sc.nextInt());
				break;

			case 5:
				try {
					list.deleteFirst();
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;

			case 6:
				try {
					list.deleteLast();
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;

			case 7:
				System.out.println("Enter the position: ");
				try {
					list.deleteAtPos(sc.nextInt());
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;

			case 8:
				list.deleteAll();
				System.out.println("Deleted all the Elements");
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
