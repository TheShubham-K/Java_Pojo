
public class Test {
	static int j = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("Hello World!");
		int i = test(13);
		System.out.println(i);
		System.out.println(j);
	}
	public static int test(int i) {
		return i++ + ++i;
	}

}
