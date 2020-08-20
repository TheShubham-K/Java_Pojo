package com.oop;

class E {
	int i = 10;
}
class D extends E {
	String s = "Hello";
}

public class Inheri {
	public static void main(String[] args) {
		E i = new E();
		System.out.println(i.i);
		System.out.println("_-----------__");
		D d = new D();
		System.out.println(d.i);
		System.out.println(d.s);
	}
}
