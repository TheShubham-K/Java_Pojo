package com.day4;

public class day4 {
	
	static int j;
	int k = 100;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;
		System.out.println("local Variable");
		day4 test = new day4();
		System.out.println("To exccess no-static variable we have to make a class variable :");
		System.out.println("Non- Static variable is : " + test.k);
	}

}
