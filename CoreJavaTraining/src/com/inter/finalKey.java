package com.inter;

interface D{
	int i = 10;
	public void test();
}

interface Y{
	int z = 9;
	public void check();
}

interface K extends Y{
	int j = 5;
	public void ktest();
}
class R implements D, K{
	
	final public void display() {
		System.out.println("Display Method for Class R!!");
	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
		System.out.println("Test Methods Implemented from Interface D");
	}

	@Override
	public void ktest() {
		// TODO Auto-generated method stub
		System.out.println("K's Test Method Implemented from Interface K");
	}

	@Override
	public void check() {
		// TODO Auto-generated method stub
		System.out.println("Y's Check Method Implemented from Interface Y");
	}
	
}

public class finalKey {
	
	static final int i = 10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		finalKey f = new finalKey();
		System.out.println("Final Key : "+ f.i);
		System.out.println("Final Key : "+ i);
		R r = new R();
		r.test();
		r.ktest();
		r.check();
		r.display();
	}

}
