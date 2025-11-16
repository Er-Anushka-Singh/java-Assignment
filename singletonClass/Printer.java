package singletonClass;

//Eager Instantiation

public class Printer {
	
	private static Printer p = new Printer();
	
	private Printer() {
		
	}
	
	public static Printer getInstance() {
		System.out.println("This is a Eager Instantiation.....");
		return p;
	}

}
