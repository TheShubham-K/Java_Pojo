package com.oop;

class Cars{
	int wheel = 4;
	String milage = "35Kmpl";
	
	public void features() {
		System.out.println("Car Feature");
	}
}

class Maruthi extends Cars{
//	String milage = "35kmpl";
	public void features() {
		System.out.println("Maruthi Feature");
	}
}


public class CarClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maruthi m = new Maruthi();
		System.out.println("Cars Milage : "+ m.milage);
		
	}

}
