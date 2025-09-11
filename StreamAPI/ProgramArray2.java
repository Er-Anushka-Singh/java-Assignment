package StreamAPI;

import java.util.Arrays;

public class ProgramArray2 {

	public static void main(String[] args) {
		int [] a = { 12,67,34,45,67 ,12,45,67};
		System.out.println("Before Apply Stream operation !........");
		Arrays.stream(a).forEach(n ->System.out.print(n+" "));
		
		System.out.println("\nAfter Apply stream operation ! ...........");
		Arrays.stream(a).distinct().forEach(n ->System.out.print(n+" "));

	}

}
