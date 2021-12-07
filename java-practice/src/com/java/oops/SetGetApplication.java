package com.java.oops;

public class SetGetApplication {
	public static void main(String[] args) {
		SettersAndGetters obj = new SettersAndGetters();
		obj.setName("Arya");
		obj.setAge(24);
		obj.setAddress("ongole");
		obj.setSalary(0);
		System.out.println("Name = " + obj.getName()+" " + "Age = " + obj.getAge()+" " + "Address = " + obj.getAddress()+" "
				+ "Salary = " + obj.getSalary());
	}
}
