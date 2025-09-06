package Composition_Aggreation.Aggreation;

public class Engine {

		String brand ;
		int hp;
		
		Engine(){
			
		}
		Engine(String brand , int hp){
			this.brand=brand;
			this.hp=hp;
		}
		public void start() {
			System.out.println("Engine Started !....");
		}
	    
		public void stop() {
			System.out.println("Engine Stopped !....");
		}

}


