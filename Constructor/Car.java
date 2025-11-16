package Constructor;

public class Car {
	
	String name;
	double price;
	int hp;
	
	Car(){
		System.out.println("This is a non-parameterized constructor ");
	}
	
	Car(String name, double price,int hp){
		this.name=name;
		this.price=price;
		this.hp=hp;
	}
	
	public String getDetails() {
		return "Name is : "+name+"\tPrice is : "+price+"\tHp is : "+hp;
	}
	
	

}
