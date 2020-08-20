package com.demo;

public class basicTicks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;
		int j = test(i++, ++i);
		System.out.println("i values : "+ i);
		System.out.println("j values : "+ j);
	}
	public static int test(int i, int j) {
		return i;
	}

}
