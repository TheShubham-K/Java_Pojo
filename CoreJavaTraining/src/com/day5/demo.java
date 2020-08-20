package com.day5;

public class demo {
	static int k;
	static int l = 20;
	int i = 10;
	int j;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(k);
		System.out.println(l);
		demo s = new demo();
		System.out.println(s.i);
		System.out.println(s.j);
		s.i = 20;
		System.out.println(s.i);
		check();
		s.test();
	}
	
	public void test() {
		System.out.println("Test Methods");
	}
	public static void check() {
		System.out.println("Check Method");
	}
}
