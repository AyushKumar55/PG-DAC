package com.app.fruits;

public class Mango extends Fruit {
	private String color;
	private double weight;
	private String name;
	private boolean fresh;

	public Mango(String nm, double wt, String c, boolean fr) {
		super(nm, wt, c, fr);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	public String taste() {
		// TODO Auto-generated method stub
		return ("Sweet");
	}

	public void pulp() {
		System.out.println("Name : " + name + "Color : " + color + " CREATING PULP !!!");
	}

}
