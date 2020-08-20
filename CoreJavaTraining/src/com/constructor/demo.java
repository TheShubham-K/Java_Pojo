package com.constructor;

public class demo {
	
	int i;
	String s;
	
	demo(){
		this(70);
		System.out.println("_________-------------_________________----------");
//		i = 10;
//		s = "kumar";
		System.out.println(i);
//		System.out.println(s);
	}
	
	demo(int i){
		this(1782, "Double Argument");
		this.i = i;
		System.out.println(i);
	}
	
	demo(int i, String s){
		this.i = i;
		this.s = s;
		System.out.println(i);
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo d = new demo();
	}

}
