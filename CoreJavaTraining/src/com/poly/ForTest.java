package com.poly;

public class ForTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;
		int[] arr = new int[i]; 
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[5] = 50;
		for(int a: arr) {
			System.out.println("Items of the Array are : "+a);
		}
	}

}
