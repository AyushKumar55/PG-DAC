package com.app.fruits;

public class Apple extends Fruit {

	private String color;
	private double weight;
	private String name;
	private boolean fresh;

	public Apple(String nm, double wt, String c, boolean fr) {
		super(nm, wt, c, fr);
	}

	@Override
	public String toString() {
		return super.toString();
	}

	@Override
	public String taste() {
		return ("Sweet and Sour");
	}

	public void jam() {
		System.out.println("Name : " + name + "Color : " + color + " MAKING JAM !!!");
	}

}
