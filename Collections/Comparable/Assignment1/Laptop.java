package Comparable;

public class Laptop implements Comparable<Laptop> {
	
	String name;
	double price;
	int ram;
	Laptop(){
		
	}
	
	Laptop(String name, double price, int ram){
		this.name=name;
		this.price=price;
		this.ram=ram;
	}
	
	public String toString() {
		return "Name is : "+name+"\tPrice is : "+price+"\tRam is : "+ram;
	}
	
	public int compareTo(Laptop l) {
		return (int)(this.price-l.price);
	}

}
