package Encapsulation.product;

public class Product {

  private String name;
  private String brand;
  private double price;
	
	public void setName(String name) {
		if(name.length()>2 && name.matches("[A-Za-z\s]+")) {
			System.out.println("Valid Name");
			this.name=name;
		}else {
			System.out.println("Invalid Name");
		}
	}
	
	public void setBrand(String brand) {
		if(brand.length()>2 && brand.matches("[A-Za-z\s]+")) {
		System.out.println("Valid brand");
		this.brand=brand;
		}
		else {
			System.out.println("Invalid brand");
		}
	}
	public void setPrice(double price) {
		if(price>= 100) {
			System.out.println("Valid Price");
			this.price=price;
		}else {
			System.out.println("Invalid Price");
		}
	}
	
   public String getName() {
		return name;
	}
   public String getBrand() {
	   return brand;
   }
   public double getPrice() {
	   return price;
   }
   
	}
	
