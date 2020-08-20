package com.practice;

class Alpha{
	static String s = " ";
	protected Alpha() {
		s += "alpha ";
	}
}

class SubAlpha extends Alpha{
	private SubAlpha() {
		s += "Sub ";
	}
}

public class SubSubAlpha extends Alpha{

	
	private SubSubAlpha(){
		s += "SubSub";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SubSubAlpha();
		System.out.println(s);
	}

}
