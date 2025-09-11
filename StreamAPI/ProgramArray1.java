package StreamAPI;

import java.util.Arrays;

public class ProgramArray1 {

	public static void main(String[] args) {
		int [] a = {12, 23 ,45 , 56,45	};
		
		int sum =Arrays.stream(a).sum();
		System.out.println("Sum is : "+sum);
	}

}
