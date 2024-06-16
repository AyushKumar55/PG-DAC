package core;

import java.io.Serializable;
import java.time.LocalDate;

public class Items implements Serializable{

	private static final long serialVersionUID = 8776501398352834664L;
	private String code;
	private String desc;
	private double price;
	private LocalDate shipmentDate;

	public Items(String code, String desc, double price, LocalDate shipmentDate) {
		super();
		this.code = code;
		this.desc = desc;
		this.price = price;
		this.shipmentDate = shipmentDate;
	}

	@Override
	public String toString() {
		return "Item Code: " + code + ", Description: " + desc + ", Price: " + price + ", Shipment Date: "
				+ shipmentDate;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public LocalDate getShipmentDate() {
		return shipmentDate;
	}

	public void setShipmentDate(LocalDate shipmentDate) {
		this.shipmentDate = shipmentDate;
	}

	
}
