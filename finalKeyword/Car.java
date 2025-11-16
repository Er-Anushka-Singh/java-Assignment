package finalKeyword;

public class Car {
	
	final static String BRAND="TATA";
	
	final String engineNo;//from Every constructor a final member should be initialized.
	 String name;
	 double price;
	
	Car(String engineNo){
		this.engineNo=engineNo;
	}

	Car(String engineNo , String name){
		this.engineNo=engineNo;
		this.name=name;
	}
}
