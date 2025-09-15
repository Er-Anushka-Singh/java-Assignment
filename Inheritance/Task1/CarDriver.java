package Inheritance.Task1;

public class CarDriver {

	public static void main(String[] args) {
		Car c1 = new Car("Honda","Civic",2022,453000,4,true,true);
		 System.out.println(c1.getDetails());
	 
         System.out.println("=========================");
		 
		 Car c2 = new Car(4,true ,true);
		 System.out.println(c2.getDetails());
		 
		 System.out.println("===========================");
		 
		 Car c3 =new Car("Tata", "Nexon", 2023,5647000,4,true,true);
		 System.out.println(c3.getDetails());
	
	}

}
