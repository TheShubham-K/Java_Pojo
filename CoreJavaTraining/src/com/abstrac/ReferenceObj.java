package com.abstrac;

abstract class Nine{
	public abstract void test1();
	public abstract void test2();
}

class Ten extends Nine{
	
	@Override
	public void test1() {
		System.out.println("Test 1 Method");
	}
	
	@Override
	public void test2() {
		System.out.println("Test 2 Method");
	}
	
	void Display() {
		System.out.println("Display Method!!");
	}
}

public class ReferenceObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ten t = new Ten();
		t.test1();
		t.test2();
		t.Display();
		System.out.println("__________________--------------________________");
		Nine RefObj = new Ten();
		RefObj.test1();
		RefObj.test2();
	}

}
