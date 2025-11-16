package Constructor;

public class CarDriver {

	public static void main(String[] args) {
		
		Car c1= new Car();
		Car c2 = new Car("MG", 345755.9,240);
		
		System.out.println(c2.getDetails());

	}

}
