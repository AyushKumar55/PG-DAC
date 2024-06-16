package com.app.fruits;

public class Orange extends Fruit {
	private String color;
	private double weight;
	private String name;
	private boolean fresh;

	public Orange(String nm, double wt, String c, boolean fr) {
		super(nm, wt, c, fr);
	}

	@Override
	public String toString() {
		return super.toString();
	}

	@Override
	public String taste() {
		return ("Sour");
	}

	public void juice() {
		System.out.println("Name : " + name + "Color : " + color + " EXTRACTING JUICE !!!");
	}

}
