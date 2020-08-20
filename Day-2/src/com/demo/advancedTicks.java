package com.demo;

public class advancedTicks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		int j = i++ + ++i + test(i++) + test(i++) + test(++i);
		System.out.println("i values : "+ i);
		System.out.println("j values : "+ j);
	}
	public static int test(int i) {
		return i++;
	}
}
