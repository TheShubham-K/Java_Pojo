package com.practice;


class Singer {
	
	public static String sing() {
		return "la";
	}
}

public class Test extends Singer {
	
	public static String sing() {
		return "fa";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test();
		Singer s = new Test();
		System.out.println(t.sing() + " "+s.sing());
	}

}
