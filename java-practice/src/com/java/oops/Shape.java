package com.java.oops;

public abstract class Shape {
	double r, h;

	public Shape(double r, double h) {
		super();
		this.r = r;
		this.h = h;
	}

	abstract double area();

	abstract double volume();

}
