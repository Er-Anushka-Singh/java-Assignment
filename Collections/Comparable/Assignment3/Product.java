package Collections.Comparable.Assignment3;


public class Product implements Comparable<Product> {

	String name;
	double price;
	String brand;
	
	Product(String name,double price,String brand){
		this.brand=brand;
		this.name=name;
		this.price=price;
	}
	
	public String toString() {
		return "Name is : "+name+"\tPrice is : "+price+"\tBrand is : "+brand;
	}
	/*
	
//	this will do comparision on the basis of brand.
	public int compareTo(Product P) {
		return this.brand.compareToIgnoreCase(P.brand);
	}
	
//	This will do comparision on the basis of name
	
	public int compareTo(Product P) {
		return this.name.compareToIgnoreCase(P.name);
		
	}
	*/
	
	// This will the comparsion on the basis of Price
	
	public int compareTo(Product P) {
		return Integer.compare((int)this.price, (int) P.price);
	}
}
