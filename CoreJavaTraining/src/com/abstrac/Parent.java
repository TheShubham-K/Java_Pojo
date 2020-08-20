package com.abstrac;

abstract class A{
	public void test() {
		System.out.println("Test A Method");
	}
	public abstract void check();
}

class B extends A{
	public void test() {
		System.out.println("Test B Method");
	}

	@Override
	public void check() {
		// TODO Auto-generated method stub
		System.out.println("Check Method");
	}
}

public class Parent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B();
		b.test();
		b.check();
	}

}
