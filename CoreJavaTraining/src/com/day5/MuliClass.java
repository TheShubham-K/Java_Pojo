package com.day5;

public class MuliClass {
//	private int i = 10;
	int i = 10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("First Main ------------------------------   ");
	}
	

}

class demo2{
	{
		System.out.println("________________________________Non-Static Method__________________________");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Second Main ------------------------------   ");
		MuliClass t = new MuliClass();
		System.out.println(t.i);
		demo2 d = new demo2();	
	}	
}
