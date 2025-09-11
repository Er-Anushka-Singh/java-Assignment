package StreamAPI;
import java.util.Arrays;

public class ProgramArray5 {

	public static void main(String[] args) {
		int [] a = { 34,23,56,45,78,98};
		System.out.println("Before Apply Stream operation !........");
		Arrays.stream(a).forEach(n ->System.out.print(n+" "));
		
		System.out.println("\nAfter Apply stream min operation ! ...........");
		int min =Arrays.stream(a).min().orElse(0);
		System.out.println("Minimum is : "+min);
		
		System.out.println("\nAfter Apply stream max operation ! ...........");
		int max =Arrays.stream(a).max().orElse(0);
		System.out.println("Maximum is : "+max);

	}

}
