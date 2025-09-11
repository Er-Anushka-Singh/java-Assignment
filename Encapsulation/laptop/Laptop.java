package Encapsulation.laptop;

public class Laptop {
	private String name ;
	private double price;
	private int ram;
	
	
	public void setName(String name) {
		if(name.length()>2 && name.matches("[A-Za-z\s]+")) {
			System.out.println("Valid Name");
			this.name=name;
		}else {
			System.out.println("Invalid Name");
		}
	}
	
	public void setPrice(double price) {
		if(price >=10000) {
			System.out.println("Valid Price");
			this.price=price;
		}else {
			System.out.println("Invalid Price");
		}
	}
	
	public void setRam(int ram) {
		if(ram>15) {
			System.out.println("fast processing  Ram");
			this.ram=ram;
		}
		else {
			System.out.println("Slow processing  Ram");
		}
	}
	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}
	public int getRam() {
		return ram;
	}
}

