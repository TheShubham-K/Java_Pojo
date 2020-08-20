package com.day4;


public class Average {

	public void process() {
		int[] score = {97,56,78,89,45,56,100,99};
		double ave = average(score);
		System.out.println("Average is : " + ave);
	}
	
	public static double average(int[] arr) {
		int total = 0;
		for(int i=0;i<arr.length;i++) {
			total += arr[i];
		}
		return (double) total/arr.length;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Average t = new Average();
//		t.process();
	}

}
