package com.oop;

class Ten{
	static int i = 10;
	static void test() {
		System.out.println("Class Ten Constructor");
	}
}

class Eleven extends Ten{
	
}


public class StaticClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Eleven e = new Eleven();
		e.i = 100;
		System.out.println("i value is = "+ e.i);
		e.test();
	}

}
