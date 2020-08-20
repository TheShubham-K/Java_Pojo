package com.day4;

public class Blocks1 {
	
	static int NoOfObject;
	{
		NoOfObject += 1;
	}
	
	static {
		System.out.println("Static Block 1");
	}
	static {
		System.out.println("Static Block 2");
	}
	static {
		System.out.println("Static Block 3");
	}
	
	{
		System.out.println("Non-Static Block 1 or IIB(Instance Intialization Block)");
	}
	{
		System.out.println("Non-Static Block 2");
	}
	{
		System.out.println("Non-Static Block 3");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Blocks1 block = new Blocks1();
		System.out.println("------------------------------");
		Blocks1 block1 = new Blocks1();
		System.out.println(block.NoOfObject);
	}

}
