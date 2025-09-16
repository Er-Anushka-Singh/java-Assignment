package Inheritance.Task3;

public class LaptopDriver {
	
	public static void main (String [] agrs) {
		
		Laptop l1 = new Laptop(201, "Backpack","Widcraft",2499.0,150
				,"7.5" ," 16",16,13.6,18,true);
		
		System.out.println(l1.getDetails());
		
		System.out.println("=================================");
		
		Electronics e1 = new Electronics(202,"MacBook Ari M2","Apple",124999.0,"1 Year",35.0);
		 System.out.println(e1.getDetails());
		 
		 System.out.println("==========================");
		 
		 Product p1 = new Product(203, "LED TV","Samsung",45999.0,40);
		 System.out.println(p1.getDetails());
	}

}
