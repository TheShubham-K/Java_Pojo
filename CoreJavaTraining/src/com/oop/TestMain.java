package com.oop;

class F{
	int i;
	static int k = 10;
	public void ftest() {
		System.out.println("Test Method");
	}
}

class G extends F{
	int j;
	public void gtest() {
		System.out.println("G test");
	}
}

class one {
	int i = 10;
	one(int i){
		System.out.println("Class One Constructor");
	}
}
class two extends one{
	
	two(){
		super(10);
		System.out.println("Class Two Constructor");	
	}
}

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Method");
/*		
		F f = new F();
		System.out.println(f.i);
		f.ftest();
		System.out.println(f.k);
		System.out.println("------------------------");
		G g = new G();
		System.out.println("j from class g "+ g.j);
		g.gtest();
		System.out.println("---------------------------");
		g.j = 100;
		System.out.println("Inititalizing j");
		System.out.println(g.j);
		g.ftest();
**/
		one o = new one(10);
		System.out.println("----------------======-------------=============-------------=======-----");
		two t = new two();
	}

}
