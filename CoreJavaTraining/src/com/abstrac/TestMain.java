package com.abstrac;

abstract class Car{
	int wheels = 4;
	public void milage(){
		System.out.println("30kmpl");
	}
	public abstract void company();
}

class Tata extends Car{
	public void company() {
		System.out.println("Tata Car Company!");
	}
}
class Toyota extends Car{
	public void company() {
		System.out.println("Toyota Car Company!");
	}
}
public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Toyota t = new Toyota();
		System.out.println("Toyota has "+t.wheels+" Wheels.");
		t.milage();
		t.company();
		System.out.println("_____________------------------___________________---------------------");
		Tata ta = new Tata();
		System.out.println("Tata Cars have "+ta.wheels+" Wheels.");
		ta.milage();
		ta.company();
	}	

}
