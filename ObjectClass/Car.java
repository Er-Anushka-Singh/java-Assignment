package objectClass;

import java.util.Objects;

public class Car implements Cloneable{
	String name;
	double price;
	String carNo;
	
	Car(){
		
	}
	
	Car(String name,double price,String carNo){
		this.name=name;
		this.price=price;
		this.carNo=carNo;
	}
	
	/*
	 * Here we cannot override the method getClass() because it have final keyword
	
	public Class getClass() {
		return 
	}
	*
	*/
	
	public String toString() {
		return "Name is : "+name+"\tPrice is : "+price+"\tCarNo is : "+carNo;
	}
	
	public boolean equals(Object obj) {
		if(obj==this)
			return true;
		if(obj==null ||obj.getClass()!=this.getClass())
			return false;
		Car c= (Car)obj;
		return this.name.equals(c.name)&& this.price==c.price && this.carNo.equals(c.carNo);
	}
	
	@Override
    public int hashCode() {
	  return Objects.hash(name,price,carNo);
  }
	
	public Car clone() throws CloneNotSupportedException{
		return (Car)super.clone();
	}
	
	
}
