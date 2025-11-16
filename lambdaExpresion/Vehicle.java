package lambdaExpresion;

@FunctionalInterface
public interface Vehicle {

  	void drive();

	static void start() {
		System.out.println("Start Vehicle");
		autoDrive();
	}
	default void stop() {
		System.out.println("Stop Vehicle");
		music();
	}
	private  void music() {
		System.out.println("Play Music");
	}
	private static void autoDrive() {
		System.out.println("Auto Drive ");
	}
	
}
