package ExceptionHandling;

import java.util.Scanner;

public class Program9 {

	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		int [] a= {3,6,7,9,0,2,1};
		System.out.println("Enter the index ");
		int index = sc.nextInt();
		try {
			System.out.println(a[index]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Index is not availaible");
		}
		try {
			System.out.println(350/a[index]);
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

	
}
