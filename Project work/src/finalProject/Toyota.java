package finalProject;


class Car {
	String carName = "Toyota";
	String carMilage = "20kmpl";
	int wheel = 4;
	
	public void testcar() {
		System.out.println("test Car");
	}
}

class Tata extends Car{
	public void features() {
		System.out.println("Tata Feature");
	}
}


public class Toyota extends Car{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Toyota t = new Toyota();
		System.out.println("Car Name is : "+ t.carName);
		System.out.println("Car Milage is " + t.carMilage);
		System.out.println("Number of Wheels are : "+t.wheel);
		t.testcar();
		Tata ta = new Tata();
		ta.features();
	}
}

class SecureBag{
	String secure = "Double Secure Bag !";
}
