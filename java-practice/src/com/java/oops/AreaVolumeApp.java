package com.java.oops;

import java.util.Scanner;

public class AreaVolumeApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the radius");
		double r = sc.nextDouble();
		System.out.println("enter the height");
		double h = sc.nextDouble();
		Shape obj1 = new Circle(r, h);
		Shape obj2 = new Cylinder(r, h);
		System.out.println("Area of circle =" + obj1.area() + " " + "Volume of circle =" + obj1.volume() + " "
				+ "Area of cylinder =" + obj2.area() + " " + "Volume of cylinder =" + obj2.volume());
		sc.close();
	}
}
