import java.util.Scanner;

class DoublyList {
	static class Node {
		// Node class fields
		private int data;
		private Node next;
		private Node prev;

		// Node class methods
		public Node() {
			data = 0;
			next = null;
			prev = null;
		}

		public Node(int val) {
			data = val;
			next = null;
			prev = null;
		}
	}

	// List class fields
	private Node head;

	public DoublyList() {
		head = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void displayForward() {
		System.out.print("Fwd List: ");
		Node trav = head;
		// traverse until null is found
		while (trav != null) {
			// print while traversing
			System.out.print(trav.data + " ");
			trav = trav.next;
		}
		System.out.println("");
	}

	public void displayBackward() {
		System.out.print("Bwd List: ");
		// special: list is empty, so just return
		if (isEmpty())
			return;
		// traverse till the last node
		Node trav = head;
		while (trav.next != null) {
			trav = trav.next;
		}
		// traverse backward using the prev
		while (trav != null) {
			// print the nodes also
			System.out.print(trav.data + " ");
			trav = trav.prev;
		}
		System.out.println("");
	}

	public void addLast(int val) {
		// create and init new node
		Node newNode = new Node(val);
		// special 1: if list is empty, make new node as first node of list
		if (isEmpty())
			head = newNode;
		// general: add node at the end
		else {
			Node trav = head;
			// traverse till last node
			while (trav.next != null)
				trav = trav.next;
			// add new node after trav (trav.next)
			trav.next = newNode;
			// newNode's prev to last node (trav)
			newNode.prev = trav;
		}
	}

	public void addFirst(int val) {
		// create and init new node
		Node newNode = new Node(val);
		// special 1: if list is empty
		if (isEmpty())
			head = newNode;
		// general: add new node at first
		else {
			// new node next show point to head
			newNode.next = head;
			// head's previous to new node
			head.prev = newNode;
			// head should point to new node
			head = newNode;
		}
	}

	public void addAtPos(int val, int pos) {
		// special 1: if list is empty, add node at the start
		// special 2: if pos<=1, add node at the start
		if (isEmpty() || pos <= 1)
			addFirst(val);
		// general: add node at given pos
		else {
			// create and init new node
			Node newNode = new Node(val);
			// traverse till pos-1(trav)
			Node temp, trav = head;
			for (int i = 0; i < pos - 1; i++) {
				// special 3: if pos > length, add node at the end
				if (trav.next == null)
					break;
				trav = trav.next;
			}
			// take temp pointer to node after trav
			temp = trav.next;
			// newNode's next should point to trav's next i.e. temp
			newNode.next = temp;
			// newNode's prev should point to trav
			newNode.prev = trav;
			// trav's next should point to newNode
			trav.next = newNode;
			// temp's prev should point to newNode
			if (temp != null) // special 3: if adding at end, next line is not required
				temp.prev = newNode;
		}
	}

	public void deleteFirst() {
		// special 1: if list is empty, throw exception
		if (isEmpty())
			throw new RuntimeException("List is empty");
		// special 2: if list has single node
		if (head.next == null)
			head = null;
		else {
			// general: make head pointing to next node
			head = head.next;
			// note: the old first node will be garbage collected
			// second node (new head) prev should be null
			head.prev = null;
		}
	}

	public void deleteLast() {
		// special 1: if list is empty, throw exception
		if (isEmpty())
			throw new RuntimeException("List is empty");
		// special 2: if list has single node
		if (head.next == null)
			head = null;
		else {
			//general case: make take temp's next node null
			Node temp = null, trav = head;
			while (trav.next != null) {
				temp = trav;
				trav = trav.next;
			}
			temp.next = null;
		}
	}
	
	public void deleteAtPos(int pos) {
		//special 1: pos = 1, delete first node
		if(pos == 1)
			deleteFirst();
		//special 2: if list is empty or pos < 1, then throw exception
		if(isEmpty() || pos < 1)
			throw new RuntimeException("List is empty or Invalid position");
		Node trav = head;
		// traverse till last pos (trav)
		for(int i = 1; i < pos; i++) {
			//special 3: if pos > length, then throw exception
			if(trav == null)
				throw new RuntimeException("Invalid position");
			trav = trav.next;
		}
		// trav's previous node's next to trav's next node
		trav.prev.next = trav.next;
		// special 4: trav's next node's prev to trav's previous node
		if(trav.next != null) //special 4: while deleting last node skip next line.
			trav.next.prev = trav.prev;
		//trav node will be garbage collected
	}
	
	public void deleteAll() {
		head = null;
	}
}

public class DoublyLinkedList {

	public static void main(String[] args) {
		DoublyList list = new DoublyList();
		Scanner sc = new Scanner(System.in);
		boolean exit = false;

		do {
			System.out.println("\nPress:\n" + "0. Exit\n" + "1. Display\n" + "2. Add First\n" + "3. Add Last\n"
					+ "4. Add at Position\n" + "5. Delete First\n" + "6. Delete Last\n" + "7. Delete at pos\n"
					+ "8. Delete All");
			switch (sc.nextInt()) {
			case 1:
				list.displayForward();
				list.displayBackward();
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