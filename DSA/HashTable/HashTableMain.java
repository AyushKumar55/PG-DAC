package day6_day7;

import java.util.LinkedList;
import java.util.Scanner;

class HashTable {
	static class Pair {
		private int key; // key = roll
		private String value; // value = name

		public Pair() {
			key = 0;
			value = "";
		}

		public Pair(int key, String value) {
			this.key = key;
			this.value = value;
		}

		@Override
		public String toString() {
			return "Pair [key=" + key + ", value=" + value + "]";
		}
	}

	private static final int SLOTS = 10;
	private LinkedList<Pair> table[];

	public int hash(int key) {
		return key % SLOTS;
	}

	@SuppressWarnings("unchecked")
	public HashTable() {
		table = new LinkedList[SLOTS];
		for (int i = 0; i < SLOTS; i++)
			table[i] = new LinkedList<>();
	}

	public void put(int key, String value) {
		// find slot for given key using hash function
		int slot = hash(key);
		// access the bucket (linked list) in that slot
		LinkedList<Pair> bucket = table[slot];
		// find the element (key-value) in that bucket - linear search
		for (Pair pair : bucket)
			//if key is duplicate, replace the value
			if (key == pair.key) {
				pair.value = value;
				return;
			}
				
		// if key not found, create new pair and add into bucket
		Pair pair = new Pair(key, value);
		bucket.add(pair);
	}

	public String get(int key) {
		// find slot for given key using hash function
		int slot = hash(key);
		// access the bucket (linked list) in that slot
		LinkedList<Pair> bucket = table[slot];
		// find the element (key-value) in that bucket - linear search
		for (Pair pair : bucket)
			if (key == pair.key)
				return pair.value;
		// if key not found, return null
		return null;
	}
}

public class HashTableMain {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		HashTable h = new HashTable();
		h.put(1, "Ayush");
		h.put(4, "Kumar");
		h.put(5, "Bhavesh");
		h.put(10, "Amit");
		h.put(24, "Vishal");
		h.put(34, "Akash");
		h.put(25, "Abhi");
		
		System.out.print("Enter roll to find: ");
		int roll = sc.nextInt();
		String name = h.get(roll);
		System.out.println("Name found: "+ name);
		
		sc.close();
	}

}
