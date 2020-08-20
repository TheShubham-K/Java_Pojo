 package com.constructor;

public class construc {
	
	int i;
	int j;
	
	construc(int val1){
		i = val1;		
	}
	
	construc(int val1, int val2){
		i = val1;
		j = val2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		construc c = new construc(10,50);
		construc d = new construc(1000);
		c.i = 10;
		c.j = 20;
		System.out.println(c.i);
		System.out.println(c.j);
		System.out.println(d.i);
		System.out.println("___________________---------------____________-----------________________");
	}

}
