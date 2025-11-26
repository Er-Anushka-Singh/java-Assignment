package objectClass.deepCopy;

public class Employ implements Cloneable{
	String name;
	int id;
	Address a;
	
	Employ(String name, int id , Address a){
		this.name=name;
		this.id=id;
		this.a=a;
	}
	
	
	public Employ clone() throws CloneNotSupportedException {
		Employ e=(Employ)super.clone();
		e.a= new Address(this.a.city,this.a.state);
		
		return e;
	}
}
