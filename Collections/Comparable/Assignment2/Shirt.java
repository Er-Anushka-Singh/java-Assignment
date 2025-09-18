package Comparable;

public class Shirt implements Comparable<Shirt>{

	
	String brand;
	double price ;
	int size;
	
	Shirt(String brand , double price , int size){
		this.brand=brand;
		this.price=price;
		this.size=size;
		
	}
	
	public String toString() {
		return "Brand is : "+brand+"\t\tPrice is : "+price+"\t\tSize is : "+size;
	}
	
	public int compareTo(Shirt S) {
		return this.brand.compareToIgnoreCase(S.brand);
	}
}
