package Composition_Aggreation.SetterInjection;

public class CarDriver {
	public static void main(String[] args) {
	
		
		// Setter Injection  Composition relation
		Car c1= new Car();
		c1.name="Tata";
		c1.setEngine(new Engine("Tata Engine" ,234));
		System.out.println(c1.name);
		c1.openGate();
		c1.closeGate();
		System.out.println(c1.e.brand);
		System.out.println(c1.e.hp);
		
		
		System.out.println("<======================>");
		
		
		// Setter Injection Aggregation method
		Car c2 = new Car();
		c2.name = "MG";
	    Engine e2 = new Engine("MG Engine", 170);
	    c2.e=e2;
		System.out.println(c2.e.brand);
		System.out.println(c2.e.hp);
		System.out.println(c2.name);
		System.out.println(c2.name.length());
		System.out.println(c2.name.toLowerCase() );
		
		
		
	}

	

}

  

