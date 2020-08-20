package com.oop;

class Three{
	int i =10;
	Three(){
		System.out.println("Class Three Constructor");
	}
	{
		System.out.println("Thrid Block");
	}
}
class Four extends Three{
	Four(){
		i = 100;
		System.out.println("Class Four Constructor");
	}
	{
		System.out.println("Fourth Block");
	}
}

class Five extends Three{
	Five(){
		System.out.println("I value is = "+ i);
		System.out.println("Class Four Constructor");
	}
	{
		System.out.println("Fifth Block");
	}
}


public class Testmain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Five f = new Five();

	}

}
