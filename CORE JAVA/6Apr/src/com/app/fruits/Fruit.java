package com.app.fruits;

public abstract class Fruit {
	private String color;
	private double weight;
	private String name;
	private boolean fresh;
	
	public Fruit (String nm, double wt, String c, boolean fr) {
		this.name=nm;
		this.weight=wt;
		this.color=c;
		this.fresh=fr;
	}
	
	@Override
	public String toString() {
		return ("Name: "+name+ " Color: "+color+ " Weight: "+weight);
	}
	
	public boolean getState() {
		return fresh;
	}
	
	public void setState() {
		this.fresh = false;
	}
	
	public String getName() {
		return name;
	}
	
	public abstract String taste();

}
