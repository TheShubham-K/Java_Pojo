package com.members;

public class basicticks {
	static int i = 10;
	static int j = 20;
	
	static void print() {
		System.out.println("Inside Print Function : ");
		System.out.println(i);
		System.out.println(j);		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(i);
		int i = 100;
		System.out.println(basicticks.j);
		System.out.println(i);
		print();
		basicticks.print();
	}

}
