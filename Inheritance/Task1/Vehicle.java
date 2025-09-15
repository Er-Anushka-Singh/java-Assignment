package Inheritance.Task1;

public class Vehicle {
	String name;
	String model;
	int year;
	double price;
	
	Vehicle(){
		
	}
	
	Vehicle(String name , String model ){
		this.name= name;
		this.model=model;
	}
	
	Vehicle(String name , String model , int year , double price){
		this(name,model);
		this.year=year;
		this.price=price;
	}
	
	public String getDetails() {
		return "Name is : "+name+"\nModel is : "+model+"\nYear is : "+year+"\nPrice is : "+price;
	}

}

