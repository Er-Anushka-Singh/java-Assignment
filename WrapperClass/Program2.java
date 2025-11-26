package wrapperClass;

public class Program2 {
	
	// Boxing And UnBoxing

	public static void main(String[] args) {
		
		
		// This is Boxing
		System.out.println("========Boxing=======");
		int x=23;
		Integer y=x;
		System.out.println("x is : "+x);
		System.out.println("y is : "+y);
		
		// This is UnBoxing
		
		Integer a=243;
		int b=a;
		System.out.println("======UnBoxing======");
		System.out.println("a is : "+a);
		System.out.println("b is : "+b);
		
		// here , we didn't have to perform upcasting /downcasting operation .It can convet automatically.

	}

}
