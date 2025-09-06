package Composition_Aggreation.Com;

public class Car {

		String name ;
		Engine e;
	
	Car(){
		
	}
	Car(String name){
		this.name=name;
	}
	Car(String name, Engine e){
		this.name=name;
		this.e=e;
	}
	
	public void  openGate() {
		System.out.println("Car OpenGate! .....");
	}
	public void closeGate() {
		System.out.println("Car closeGate !......");
	}
	

}

  

