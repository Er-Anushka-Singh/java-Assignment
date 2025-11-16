package Anonymous;

public class VehicleDriver {

	public static void main(String[] args) {
		Vehicle car = new Vehicle() {

			@Override
			void start() {
				System.out.println("Car start !");
				
			}

			@Override
			void drive() {
				System.out.println("Car Drive ! ");
				
			}

			@Override
			void stop() {
				System.out.println("Car Stop !");
				
			}
			
		};
		car.drive();
		car.drive();
		car.stop();
		
		Vehicle bus = new Vehicle() {

			@Override
			void start() {
				System.out.println("Bus start");
				
			}

			@Override
			void drive() {
				System.out.println("Bus drive");
				
			}

			@Override
			void stop() {
				System.out.println("Bus stop");
				
			}
			
		};
		bus.start();
		bus.drive();
		bus.stop();

	}

}
