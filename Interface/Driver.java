package Interface;

public class Driver {

	public static void main(String[] args) {
		
		Car c1 = new Car();
		c1.openGate();
		c1.closeGate();
		c1.accelerater();
		c1.start();
		c1.stop();
		
		System.out.println("============================");
		
		TwoWheeler tw =(TwoWheeler) new Bike();
		tw.start();
		tw.helmetStorage();
		tw.stop();
		
		TwoWheeler tw1= new Bike("Honda",167879.9,"White");
		System.out.println("=============================");
		System.out.println(tw1.getDetails());

	}

}
