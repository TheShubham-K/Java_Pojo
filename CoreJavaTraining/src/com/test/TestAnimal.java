package com.test;

class Animal {
	public void Eat() {
		System.out.println("Generic Eat Method");
	}
}

class Horse extends Animal{
	public void Eat() {
		System.out.println("Horse Eat Method");
	}
}

class Elephant extends Animal{
	Tusk t;
	public void Eat() {
		System.out.println("Elephant Eat Method");
	}
}
class Tusk{
	int noOfTask = 2;
}
public class TestAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Elephant e = new Elephant();
		e.Eat();
		e.t = new Tusk();
		System.out.println("number of Tusk are : "+ e.t.noOfTask);
		Horse h = new Horse();
		h.Eat();
	}

}
