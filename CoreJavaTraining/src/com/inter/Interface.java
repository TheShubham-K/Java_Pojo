package com.inter;


interface A{
	void test1();
	void test2();
}

class B implements A{

	@Override
	public void test1() {
		// TODO Auto-generated method stub
		System.out.println("Test 1 Method By Implementation");
	}

	@Override
	public void test2() {
		// TODO Auto-generated method stub
		System.out.println("Test 2 Method By Implementation");
	}
}

public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B();
		b.test1();
		b.test2();
		System.out.println("__________________--------------________________");
		A a = new B();
		a.test1();
		a.test2();
	}

}
