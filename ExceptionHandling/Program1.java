package ExceptionHandling;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number a ");
		int a = sc.nextInt();
	    int b=0;
        
        System.out.println(a+" + "+b+" = "+(a+b));
        System.out.println(a+" - "+b+" = "+(a-b));
        System.out.println(a+" / "+b+" = "+(a/b));
        System.out.println(a+" * "+b+" = "+(a*b));
	}

}
