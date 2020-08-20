package com.oop;

public class Employee {

	String empName;
	int empId;
	String empDOB;
	
	public void emplProject() {
		System.out.println("Employee Project!!");
	}
	
	
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empId=" + empId + ", empDOB=" + empDOB + "]";
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee();
		e.empName = "Dummy name";
		e.empId = 123;
		e.empDOB = "12-06-2000";
		
		if(e.empName!=null && e.empName!="") {
			System.out.println("Employee name: "+ e.empName);
			System.out.println("Employee Id : "+ e.empId);
			System.out.println("Employee Date-Of-Birth: "+ e.empDOB);
		}else {
			System.out.println("Please  Provide neccessary information!");
		}
		Enscap emp = new Enscap();
		emp.setEmpName(e.empName);
		System.out.println("Employee name is : "+emp.getEmpname());
	}

}
