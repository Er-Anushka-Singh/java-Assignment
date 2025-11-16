package tyre;

public class CEAT {
     public static int x=10;
     protected static int y=30;
     static int z=20;
     private static int a=25;
     
     public static void test() {
    	 System.out.println("this is a public access modifier");
     }
     
     protected static void demo() {
    	 System.out.println("This is a protected access modifier");
     }
     static void start() {
    	 System.out.println("This is default access modifier");
     }
     private static void drive() {
    	 System.out.println("This is private access modifier");
     }
     
     public static void main(String[] args) {
        System.out.println("Data can be access from the same package in same class.........");
        System.out.println("This is CEAT class");
		System.out.println();
		System.out.println(CEAT.x);
		System.out.println(CEAT.y);
		System.out.println(CEAT.z);
		System.out.println(CEAT.a);
	
		CEAT.test();
		CEAT.demo();
		CEAT.start();
		CEAT.drive();
	}
}
