package com.day4;

public class Block2 {
	
	static int i;
	static {
		i = 10;
		System.out.println("i value = "+ i);
	}
	{
		//i = 100;
		System.out.println("i value = "+ i);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Block2 block = new Block2();
		block.i = 2;
		System.out.println("--------------------------");
		Block2 block1 = new Block2();
	}

}
