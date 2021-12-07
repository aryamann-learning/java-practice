package com.java.oops;

public class Circle extends Shape {

	public Circle(double r, double h) {
		super(r, h);

	}

	double area() {

		return 3.14 * r * r;
	}

	@Override
	double volume() {
		return 4 * 3.14 * Math.pow(r, 3) / 3;
	}
}
