package lambdaExpresion;

public class VehicleDriver {

	public static void main(String[] args) {
		
		Vehicle.start();
		System.out.println("==============");
		
		Vehicle car= ()->System.out.println("Driver Car");
        car.drive();
       System.out.println("=================");
        
		Vehicle bus = ()->System.out.println("Drive bus");	
        bus.drive();
        System.out.println("============");
        
        Vehicle bike = ()->{System.out.println("Drive bike");
               System.out.println("This is bike");
        };
        
        bike.drive();
        System.out.println("==============");
        
        car.stop();
        
	}

}
