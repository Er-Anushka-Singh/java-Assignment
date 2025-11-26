package objectClass;

public class CarDriver {
	public static void main(String[] args) throws CloneNotSupportedException {
		Car car1=new Car("BMW",678987.73,"KQREN34433");
		Car car2=new Car("MG",678912.23,"KQRBJJ34433");
		Car car3=new Car("BMW",678987.73,"KQREN34433");
		Car car4=new Car("BMW",678987.73,"KQREN34433");
		
		System.out.println("========getClass()=======");
		System.out.println("Car class "+car1.getClass());
		System.out.println("Car class "+car2.getClass());
		System.out.println("Car class "+car3.getClass());
		System.out.println("Car class "+car4.getClass());
		
		System.out.println("=======toString()=========");
		System.out.println(car1);
		System.out.println(car2);
		System.out.println(car3);
		System.out.println(car3.toString());
		System.out.println(car4);
		
		System.out.println("=======equals()=======");
		System.out.println(car1==car2);
		System.out.println(car2==car3);
		System.out.println(car1==car3);
		System.out.println(car1==car4);
		System.out.println("==========");
		System.out.println(car1.equals(car4));
		System.out.println(car2.equals(car1));
		System.out.println(car1.equals(car3));
		System.out.println(car2.equals(car4));
		
		System.out.println("========hashCode=====");
		System.out.println(car1.hashCode());
		System.out.println(car2.hashCode());
		System.out.println(car3.hashCode());
		System.out.println(car4.hashCode());
		
		System.out.println("======Clone()========");
		Car car5=car1.clone();
		System.out.println(car5);
		
		
		
		
	}

}
