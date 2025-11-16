package variableInjection;

public class CarDriver {

	public static void main(String[] args) {
		
		Car c1= new Car();
		
		c1.e = new Engine("Tata");
		System.out.println(c1.e.brand);
	
		c1.e= new Engine("Mg");
		System.out.println(c1.e.brand);
		
		Car c2 = new Car();
		c2.e= new Engine("Maruti");
		System.out.println(c2.e.brand);

	}

}
