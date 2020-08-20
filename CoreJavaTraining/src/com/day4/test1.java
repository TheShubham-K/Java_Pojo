package com.day4;

public class test1 {
	
	int i = 10;
	int j = 20;
	
	public void test() {
		System.out.println("Non-Static Method : ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1 t = new test1();
		test1.testStatic();
		System.out.println(t.i);
		t.i = 100;
		t.test();
		System.out.println("I's value : " + t.i);
		System.out.println("J's value : " +t.j);
	}

	public static void testStatic() {
		System.out.println("Static Method : ");
	}
}
