package Inheritance.Task1;


public class Car extends Vehicle {
	
	
	int numberOfDoors;
	boolean isAutomatic;
	boolean sunroof;
	
	
	Car(){
		
	}
	
	
	Car(String name , String model , int year , double price ,int numberOfDoors ,
			boolean isAutomatic,boolean sunroof ){
		super(name,model,year , price);
		this.numberOfDoors=numberOfDoors;
		this.isAutomatic=isAutomatic;
		this.sunroof=sunroof;
		
	}
	
	Car(int numberOfDoors ,boolean isAutomatic , boolean sunroof){
		this.numberOfDoors = numberOfDoors;
		this.isAutomatic=isAutomatic;
		this.sunroof=sunroof;
	}
	
	public String getDetails() {
		
		return super.getDetails()+"\nNumber of Doors : "+numberOfDoors+"\nIs Automatic : "+isAutomatic+"\nSunroof : "+sunroof;
	}

}
