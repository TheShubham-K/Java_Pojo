package com.constructor;

public class A {
	
	int i;
	int j;
	
	{
		i = 10;
		j = 50;
		System.out.println("IIB : ");
		System.out.println("I val is : "+i);
		System.out.println("J val is : "+j);
	}
	A (){
		this(10);
		System.out.println("No Argu : ");
		i = 10;j = 20;
		System.out.println(" i : "+i);
		System.out.println("j : "+ j);
	}
	
	A (int i){
		this(50,89);
		System.out.println("Single Argu : ");
		this.i = 10;
		System.out.println(" i : "+i);
	}
	
	A (int i, int j){
		System.out.println("Double Argu : ");
		this.i = i;
		this.j = j;
		System.out.println(" i : "+i);
		System.out.println("j : "+ j);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
	}

}
