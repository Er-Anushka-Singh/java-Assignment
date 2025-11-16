package VariableShadowing;

public class Vehicle {
	
	 int x=12;
	
	public  void test() {
		int x=20;
		System.out.println(x);
		System.out.println(this.x);
		x=this.x;
		System.out.println(x);
		
		
	}
public static void main(String[] args) {
	Vehicle v1 = new Vehicle();
	v1.test();
}
}
