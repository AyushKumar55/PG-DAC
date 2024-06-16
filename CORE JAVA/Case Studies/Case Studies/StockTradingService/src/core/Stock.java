package core;

import java.time.LocalDate;

public class Stock {
	private String stock_id;
	private String stock_name;
	private String company_name;
	private double price;
	private LocalDate closingDate;
	private int qty;
	
	
	public Stock(String stock_id, String stock_name, String company_name, double price, LocalDate closingDate,
			int qty) {
		super();
		this.stock_id = stock_id;
		this.stock_name = stock_name;
		this.company_name = company_name;
		this.price = price;
		this.closingDate = closingDate;
		this.qty = qty;
	}


	@Override
	public String toString() {
		return "Stock Id: " + stock_id + ", Stock Name: " + stock_name + ", Company Name: " + company_name
				+ ", Price: " + price + ", Closing Date: " + closingDate + ", Quantity: " + qty;
	}


	public String getStock_id() {
		return stock_id;
	}


	public void setStock_id(String stock_id) {
		this.stock_id = stock_id;
	}


	public String getStock_name() {
		return stock_name;
	}


	public void setStock_name(String stock_name) {
		this.stock_name = stock_name;
	}


	public String getCompany_name() {
		return company_name;
	}


	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public LocalDate getClosingDate() {
		return closingDate;
	}


	public void setClosingDate(LocalDate closingDate) {
		this.closingDate = closingDate;
	}


	public int getQty() {
		return qty;
	}


	public void setQty(int qty) {
		this.qty = qty;
	}
	
	
	

}
