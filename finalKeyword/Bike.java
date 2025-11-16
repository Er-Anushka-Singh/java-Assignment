package finalKeyword;

public class Bike {

	final static String BRAND = "Honda";
	
	private final String engineNo;
	private final String name;
	private final double price;
	
	Bike(String engineNo , String name, double price){
		this.engineNo=engineNo;
		this.name=name;
		this.price=price;
	}
	
	public String getEngine() {
		return engineNo;
	}
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
}
