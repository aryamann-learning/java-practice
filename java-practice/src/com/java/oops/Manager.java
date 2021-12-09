package com.java.oops;

public class Manager extends EmployeeSalary {
	int da, ta;

	public Manager(String name, int salary) {
		super(name, salary);
	}

	public Manager(String name, int salary, int da, int ta) {
		super(name, salary);
		this.da = da;
		this.ta = ta;
	}

	public int getSalary() {
		return (super.getSalary() + da + ta);
	}

}
