package com.day4;

public class Block3 {
	static int k = 90;
	int i = 10;
	{
		System.out.println("K's value : " +k);
		System.out.println("i value : "+i);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Block3 block = new Block3();
		block.i = 100;
		System.out.println(block.i);
		System.out.println("--------------------------------");
		Block3 block1 = new Block3();
	}

}
