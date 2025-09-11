package StreamAPI;

import java.util.Arrays;
import java.util.OptionalDouble;

public class ProgramArray4 {

	public static void main(String[] args) {
	   int [] a = {23,56,78,45,35,43};
		System.out.println("Before Apply Stream operation !........");
		Arrays.stream(a).forEach(n ->System.out.print(n+" "));
		
		System.out.println("\nAfter Apply stream operation ! ...........");
		
		
		double avg = Arrays.stream(a).average().orElse(0.0);
		System.out.println("Average is "+avg);
	
		//OR
		
	    OptionalDouble avg1 =Arrays.stream(a).average();
	    System.out.println(avg1);

	}

}
