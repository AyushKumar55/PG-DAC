package core;

import java.io.Serializable;
import java.time.LocalDate;

public class Pen implements Serializable {
	private static final long serialVersionUID = -3418958413661679106L;
	static int auto;
	private int id;
	private Brands brand;
	private double price;
	private String color;
	private String InkColor;
	private Material material;
	private int stock;
	private LocalDate stockUpdateDate;
	private LocalDate stockListingDate;
	private double discounts;
	
	
	public Pen(Brands brand, double price, String color, String inkColor, Material material, int stock,
			LocalDate stockUpdateDate, LocalDate stockListingDate) {
		super();
		this.id = ++auto;
		this.brand = brand;
		this.price = price;
		this.color = color;
		this.InkColor = inkColor;
		this.material = material;
		this.stock = stock;
		this.stockUpdateDate = stockUpdateDate;
		this.stockListingDate = stockListingDate;
		this.discounts = 0;
	}
	
	@Override
	public String toString() {
		return "Pen [id=" + id + ", brand=" + brand + ", price=" + price + ", color=" + color + ", InkColor=" + InkColor
				+ ", material=" + material + ", stock=" + stock + ", stockUpdateDate=" + stockUpdateDate
				+ ", stockListingDate=" + stockListingDate + ", discounts=" + discounts + "]";
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getId() {
		return id;
	}

	public Brands getBrand() {
		return brand;
	}


	public void setBrand(Brands brand) {
		this.brand = brand;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getInkColor() {
		return InkColor;
	}


	public void setInkColor(String inkColor) {
		InkColor = inkColor;
	}


	public Material getMaterial() {
		return material;
	}


	public void setMaterial(Material material) {
		this.material = material;
	}


	public int getStock() {
		return stock;
	}


	public void setStock(int stock) {
		this.stock = stock;
	}


	public LocalDate getStockUpdateDate() {
		return stockUpdateDate;
	}


	public void setStockUpdateDate(LocalDate stockUpdateDate) {
		this.stockUpdateDate = stockUpdateDate;
	}


	public LocalDate getStockListingDate() {
		return stockListingDate;
	}


	public void setStockListingDate(LocalDate stockListingDate) {
		this.stockListingDate = stockListingDate;
	}


	public double getDiscounts() {
		return discounts;
	}


	public void setDiscounts(double discounts) {
		this.discounts = discounts;
	}
	
	
	
	
}


