package StreamAPI;

import java.util.Arrays;

public class ProgramArray3 {

	public static void main(String[] args) {
	   int [] a = { 23,45,56,34,78,76};
		System.out.println("Before Apply Stream operation !........");
		Arrays.stream(a).forEach(n ->System.out.print(n+" "));
		
		System.out.println("\nAfter Apply stream operation ! ..........."); 
	   Arrays.stream(a).filter(n -> n%2==0).forEach(n -> System.out.print(n+" "));

	}

}

