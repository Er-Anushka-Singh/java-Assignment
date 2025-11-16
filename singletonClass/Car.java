package singletonClass;

// lazy Instantiation

public class Car {
	
	private static Car c =null;
	
	private Car() {
		
	}
	
	public static Car getInstance() {
		if(c==null) {
		    System.out.println("This is Lazy instantiation.......");
		    c = new Car();
		}
		return c;
	}

}
