package Interface;

public class Bike implements TwoWheeler{
	
	String name;
	double price;
	String color;
	Bike(){
		
	}
	
	Bike(String name , double price , String color ){
		this.color=color;
		this.price=price;
		this.name=name;
	}

	@Override
	public void start() {
		System.out.println("Start Bike !.....");
		
	}

	@Override
	public void stop() {
		System.out.println("Stop Bike ! ....");
		
	}

	@Override
	public void kickStart() {
		System.out.println("Kick the hurdal !....");
		
	}

	@Override
	public void helmetStorage() {
		System.out.println("Wear the helmet !.....");
		
	}

	@Override
	public void sideStandEngine() {
		System.out.println("Side stand engine !.....");
		
	}
	
	@Override 
	public String getDetails() {
		return "Name is : " +name+"\tPrice is : "+price+"\tColor is : "+color;
	}

}
