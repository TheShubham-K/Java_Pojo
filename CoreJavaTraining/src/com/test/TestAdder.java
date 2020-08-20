package com.test;

class Adder{
	public int addThem(int i, int j) {
		return i+j;
	}
}


class DoubleAdd extends Adder{
	public double addThem(double i, double j) {
		return i+j;
	}	
}
public class TestAdder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Adder a = new Adder();
		int b  = 20;
		int c  = 40;
		int result = a.addThem(b, c);
		System.out.println("AddThem Value is : "+ result);
		DoubleAdd d = new DoubleAdd();
		double Dresult = d.addThem(56.3, 45.7);
		System.out.println("DoubleAddThem Value is : "+ Dresult);

	}

}
