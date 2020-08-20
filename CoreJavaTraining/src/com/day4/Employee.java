package com.day4;

public class Employee {
	
	String empName;
	int empId;
	long empSalary;
	static String companyName = "Oyester";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee = new Employee();
		employee.empName = "First";
		employee.empId = 11;
		employee.empSalary = 10000;
		System.out.println(employee.empName);
		System.out.println(employee.empId);
		System.out.println(employee.empSalary);
		System.out.println(Employee.companyName);
		System.out.println("-----------------------");
		Employee employee1 = new Employee();
		employee1.empName = "Second";
		employee1.empId = 22;
		employee1.empSalary = 20000;
		System.out.println(employee1.empName);
		System.out.println(employee1.empId);
		System.out.println(employee1.empSalary);
		System.out.println(Employee.companyName);
	}

}
