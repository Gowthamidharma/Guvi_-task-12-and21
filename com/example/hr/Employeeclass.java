package com.example.hr;

public class Employeeclass {

	String name;
	double salary;
	int id;

	
	  public Employeeclass(int id) {
		  this.id=id;
	  System.out.println("Employee ID : " + id); }
	 

	public void printName(String name) {
		this.name = name;

		System.out.println("Employee Name : " + name);

	}

	public void printsalary(double salary) {
		this.salary = salary;
		System.out.println("Employee Salary : " + salary);
	}

}
