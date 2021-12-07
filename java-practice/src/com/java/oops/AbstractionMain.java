package com.java.oops;

public class AbstractionMain {
public static void main(String[] args) {
	VehicalsAbstraction bike = new Bike();
	VehicalsAbstraction car = new Car();
		int bikespeed = bike.getSpeed();    
        int carspeed = car.getSpeed();
        System.out.println("Speed of Bike is: "+bikespeed+" Km/h");
        System.out.println("Speed of Car is: "+carspeed+" Km/h");
		
}
}
