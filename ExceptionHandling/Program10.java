package ExceptionHandling;

import java.util.Scanner;

public class Program10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the a ");
		int a= sc.nextInt();
		System.out.println("Enter the b");
		int b = sc.nextInt();
		 System.out.println(a+" + "+b+" = "+(a+b));
	        System.out.println(a+" - "+b+" = "+(a-b));
	        try {
	        	System.out.println("Try Blocks Starts");
	            System.out.println(a+" / "+b+" = "+(a/b));
	            System.out.println("Try Blocks Ends");
	        }catch(ArithmeticException e) {
	        	System.out.println("=============");
	        	System.out.println(e);
	        	System.out.println(e.getMessage());
	        	e.printStackTrace();
	        	System.out.println("==============");
	        	System.out.println(a+" / "+b+" = infinity");
	        	System.out.println(a+" * "+b+(a*b));
	        }finally {
	        	sc.close();
	        	System.out.println("Scanner close");
	        }
	        
	}

}
