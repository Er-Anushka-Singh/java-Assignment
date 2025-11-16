package Interface;

public class Car implements FourWheeler {

	@Override
	public void start() {
		System.out.println("Car started !...");
		
	}

	@Override
	public void stop() {
		System.out.println("Car stopped !.....");
		
	}

	@Override
	public void openGate() {
		System.out.println("Open the Gate !.....");
		
	}

	@Override
	public void closeGate() {
		System.out.println("Close the Gate !..........");		
	}

	@Override
	public void accelerater() {
		System.out.println("Press the Accelerater !...........");
		
	}

}
