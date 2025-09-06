package Composition_Aggreation.SetterInjection;

public class Car {

		String name ;
		Engine e;
	
	Car(){
		
	}
	
	public void setEngine(Engine e) {
		this.e=e;
	}
	
	
	
	public void  openGate() {
		System.out.println("Car OpenGate! .....");
	}
	public void closeGate() {
		System.out.println("Car closeGate !......");
	}
	

}

  

