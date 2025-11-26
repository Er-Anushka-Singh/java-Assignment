package objectClass.shallowCopy;

public class Employ implements Cloneable{
	String name;
	int id;
	Address a;
	
	Employ(String name, int id , Address a){
		this.name=name;
		this.id=id;
		this.a=a;
	}
	
	@Override
	public Employ clone() throws CloneNotSupportedException {
		return (Employ)super.clone();
	}

}
