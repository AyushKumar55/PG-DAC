package core;

import java.time.LocalDateTime;

public class Grocery {
	private String name;
	private int price;
	private int qty;
	private LocalDateTime stockUpdate;

	public Grocery(String name, int price, int qty, LocalDateTime stockUpdate) {
		super();
		this.name = name;
		this.price = price;
		this.qty = qty;
		this.stockUpdate = stockUpdate;
	}
	
	@Override
	public String toString() {
		return "Name: " + name + ", Price/Unit: " + price + ", Quantity: " + qty;
	}
	
	// WRAPPED ITEM NAME AS PRIMARY KEY 
	public Grocery(String name) {
		super();
		this.name = name;
	}
	public boolean equals(Object o) {
		if(o instanceof Grocery) {
			Grocery g = (Grocery)o;
			return this.name.equals(g.name);
		}
		return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public LocalDateTime getStockUpdate() {
		return stockUpdate;
	}

	public void setStockUpdate(LocalDateTime stockUpdate) {
		this.stockUpdate = stockUpdate;
	}

	public int getPrice() {
		return price;
	}
}
