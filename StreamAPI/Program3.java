package StreamAPI;

import java.util.ArrayList;

public class Program3 {


	public static void main(String[] args) {
		  ArrayList<Integer> l1 = new ArrayList<>();
		   l1.add(34);
		   l1.add(89);
		   l1.add(23);
		   l1.add(90);
		   l1.add(56);
		   l1.add(18);
		   System.out.println("Before Stream API .......");
		   System.out.println(l1);
		   
		   l1.stream().filter(n-> n%2==1).forEach(n -> System.out.println(n));

	}

}
