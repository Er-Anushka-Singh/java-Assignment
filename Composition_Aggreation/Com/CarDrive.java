package Composition_Aggreation.Com;

public class CarDrive {

	public static void main(String[] args) {
		
		// Constructor  Composition relation
		Car c1= new Car("Tata", new Engine("Tata Engine",220));
		System.out.println(c1.name.toUpperCase());
		System.out.println(c1);
		System.out.println(c1.e.brand);
		System.out.println(c1.e.hp);
		System.out.println(c1);
		
		
		// Constructor Aggregation method
		String name2 = "MG";
		Engine e2 = new Engine("MG Engine", 170);
		Car c2 = new Car(name2 , e2);
		System.out.println(c2.e.brand);
		System.out.println(c2.e.hp);
		System.out.println(c2.name);
		System.out.println(c2.name.length());
		System.out.println(c2.name.toLowerCase() );
		
		
	}

	

}

  

