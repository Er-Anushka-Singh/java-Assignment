package setterInjection;

public class Engine {
	
	String brand;
	
	Engine(String brand){
		this.brand=brand;
	}
	
	public void start() {
		System.out.println("Engine started !.....");
	}
	public void stop() {
		System.out.println("Engine stopped ! .....");
	}
}
