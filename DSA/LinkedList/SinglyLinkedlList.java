package day2;

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

	public void display() {
		Node trav = head;
		System.out.print("List: ");
		while (trav != null) {
			System.out.print(trav.data + " ");
			trav = trav.next;
		}
		System.out.println("");
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

	public void addAtPos(int val, int pos) {
		// create new node and init it
		Node newNode = new Node(val);
		// special 1: if list is empty, add node at the start
		// special 2: if pos<=1, add node at the start
		if (head == null || pos <= 1)
			addFirst(val);
		else {
			Node trav = head;
			// traverse till pos-1 (trav)
			for (int i = 1; i < pos - 1; i++) {
				//special 3: if pos > length of list, add node at the end
				if(trav.next == null)
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
		//special 1: if list is empty, throw new exception
		if(head == null)
			throw new RuntimeException("List is empty.");
		//general case: make head pointing to the next node
		head = head.next;
		// note: the old first node will be garbage collected
	}
	
	public void deleteLast() {
		// special 1: if list is empty
		if (head == null)
			throw new RuntimeException("List is empty");            
		// special 2: if list has only one node
		if(head.next == null)
			head = null;
		else {
			Node temp = null, trav = head;
			//Traversing till last node
			while(trav.next != null) {
				temp = trav; // at second last node
				trav = trav.next;
			}
			//changing next of second last node
			temp.next = null;
		}
	}
	
	public void deleteAtPos(int pos) {
		//special 1: if pos = 1
		if(pos == 1)
			deleteFirst();
		//special 2: if list is empty or pos < 1, then throw exception
		if(head == null || pos < 1)
			throw new RuntimeException("List is empty or Invalid Position.");
		//take temp pointer running behind trav
		Node temp = null, trav = head;
		//traverse till pos(trav)
		for(int i = 1; i < pos; i++) {
			//special 3: if pos is beyond list length, then throw exception
			if(trav == null)
				throw new RuntimeException("Invalid Position.");
			temp = trav;
			trav = trav.next;
		}
		//trav node is to be deleted and temp node is before that
		temp.next = trav.next;
		//trav node will be garbage collected
	}
	
	public void deleteAll() {
		head = null;
		//all nodes will be garbage collected
	}
}

public class SinglyLinkedlList {
	public static void main(String[] args) {
		SinglyList list = new SinglyList();
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