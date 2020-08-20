package com.oop;

public class A {
	
	int i = 10;
	String s = "Hello";

	public void test() {
		System.out.println("Test method : A");
	}
	public void testb() {
		System.out.println("Test method : B");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		System.out.println(a.s);
		a.test();
		B b = new B();
		b.bMethod();
	}

}

class B{
	public void bMethod() {
		A a = new A();
		a.testb();
		System.out.println("Accessing Class A through Class B");
	}
}