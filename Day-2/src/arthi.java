
public class arthi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 50;
		int b  = 100;
		System.out.println("Sum of Two Number : "+ addout(a, b));
		System.out.println("Sub of Two Number : "+ subout(a, b));
		System.out.println("Mul of Two Number : "+ mulout(a, b));
		System.out.println("Div of Two Number : "+ divout(a, b));
		System.out.println("Modulus of Two Number : "+ modout(a, b));
		System.out.println("It worked !");
	}
	public static int addout(int a, int b) {
		return (a + b);
	}
	public static int mulout(int a, int b) {
		return (a*b);
	}
	public static int subout(int a, int b) {
		return (b - a);
	}
	public static int divout(int a, int b) {
		return (b / a);
	}
	public static int modout(int a, int b) {
		return (b % a);
	}

}
