package com.bridgelabz.payrollService.Models;

import java.time.LocalDate;

public class EmployeePayrollData {
	
	public int id;
	public String name;
	public double salary;
	public LocalDate startDate;

	public EmployeePayrollData(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public EmployeePayrollData(int id, String name, double salary, LocalDate startDate) {
		this(id,name,salary);
		this.startDate = startDate;
	}

	public void printDataFileIO() {
		System.out.println("------------------------------------------------------");
		System.out.println("Employee ID: "+id);
		System.out.println("Employee Name: "+name);
		System.out.println("Employee Salary: "+salary);
		System.out.println("------------------------------------------------------");
		System.out.println();
	}
	
	public void printDataDBIO() {
		System.out.println("------------------------------------------------------");
		System.out.println("Employee ID: "+id);
		System.out.println("Employee Name: "+name);
		System.out.println("Employee Salary: "+salary);
		System.out.println("Employee Start Date: "+startDate);
		System.out.println("------------------------------------------------------");
		System.out.println();
	}
	
	public String pushData() {
		return "id = " + id + ", name = " + name + ", salary = " + salary;
	}
	
	@Override
	public String toString() {
		return "Created new Employee Data";
	}
}