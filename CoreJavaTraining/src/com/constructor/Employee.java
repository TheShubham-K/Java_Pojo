package com.constructor;

public class Employee {
	
	
	String empName;
	int empId;
	long phNo;
	
	Employee(String empName, int empId, long phNo){
		this.empName = empName;
		this.empId = empId;
		this.phNo = phNo;
	}
	
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empId=" + empId + ", phNo=" + phNo + "]";
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee("Shubham", 001, 98989889989998L);
		System.out.println(e.empName);
		System.out.println(e.empId);
		System.out.println(e.phNo);
		System.out.println("__________________------------------Override_____________________-_------------------------------");
		System.out.println(e);
	}

}
