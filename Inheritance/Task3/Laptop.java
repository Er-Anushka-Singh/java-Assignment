package Inheritance.Task3;


public class Laptop extends Electronics {
	
	String processor;
	int ramSize;
	double screenSize;
	int batteryLife;
	boolean isTouchscreen;
	
	
	Laptop(){
		
	}
	
	Laptop(int productId , String name , String brand,double price,
			int stockQuantity, String weight,
			String processor,int ramSize,double screenSize,
			int batteryLife,boolean isTouchscreen){
		
		super(productId , name, brand ,price ,stockQuantity,weight);
		this.batteryLife=batteryLife;
		this.isTouchscreen=isTouchscreen;
		this.ramSize=ramSize;
		this.screenSize=screenSize;
		this.processor=processor;
	}
	
	Laptop(	String processor,int ramSize,double screenSize){
		this.ramSize=ramSize;
		this.screenSize=screenSize;
		this.processor=processor;
	}
	
	public String getDetails() {
		return super.getDetails()+"\nProcessor is : "+processor+"\nRam Size is : "+
	ramSize+"\nScreen Size : "+screenSize+"\nBattery Life is : "+batteryLife+"\nTouch Screen is : "+isTouchscreen;
	}
	
	

}
