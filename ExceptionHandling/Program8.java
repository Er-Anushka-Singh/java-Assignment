package ExceptionHandling;

import java.util.Scanner;

public class Program8 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
     
     int [] c= { 4,7,9,0,3,2};
     System.out.println("enter the index : ");
     int index = sc.nextInt();
     
         try {
        	 System.out.println(350/c[index]);
        	 System.out.println(c[index]);
         }catch(ArithmeticException e) {
        	 System.out.println(350+" / "+c[index]+" = infinity ");
         }
         catch(ArrayIndexOutOfBoundsException e) {
        	 System.out.println(e.getMessage());   	 
        	 
         }catch(Exception e){
        	 System.out.println(e.getMessage());
         }
	}

}
