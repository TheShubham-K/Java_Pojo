package com.oop;

class Car {
	String carName = "Toyota";
	String carMilage = "20kmpl";
	int wheel = 4;
	
	public void testcar() {
		System.out.println("test Car");
	}
}

class Tata extends Car{
	public void features() {
		System.out.println("Maruthi Feature");
	}
}


public class Toyota extends Car{
	SecureBag se = new SecureBag();
	public static void main(String[] args) {
		Toyota t = new Toyota();
		System.out.println("Car Name is : "+ t.carName);
		System.out.println("Car Milage is " + t.carMilage);
		System.out.println("Number of Wheels are : "+t.wheel);
		t.testcar();
		Tata ta = new Tata();
		ta.features();
	}
}

class SecureBag{
	String secure = "Double Secure Bag !";
}