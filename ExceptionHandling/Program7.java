package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
        System.out.println("Enter the a ");
        int a = sc.nextInt();
        System.out.println("Enter the b ");
        int b = sc.nextInt();
		System.out.println(a +" + "+b +" = "+(a+b));
		System.out.println(a +" - "+b+" = "+(a-b));
	     	try {
		    	System.out.println(a+" / "+b+" = "+(a/b));
	     	}catch(ArithmeticException e) {
			System.out.println(a+" / "+b+" = infinity ");
	    	}
		System.out.println(a+" * "+b+" = "+(a*b));
		}catch(InputMismatchException e) {
			System.out.println(e.getMessage());
		}
        
        System.out.println("=====Program Ends ==========");
	}

}
