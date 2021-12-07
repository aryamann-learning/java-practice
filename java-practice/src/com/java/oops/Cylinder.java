package com.java.oops;

public class Cylinder extends Shape {

	public Cylinder(double r, double h) {
		super(r, h);
	}

	double area() {
		return ((2 * 3.14 * r * r) + (2 * 3.14 * r * h));
	}

	double volume() {
		return 3.14 * r * r * h;
	}

}
