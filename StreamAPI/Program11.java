package StreamAPI;

import java.util.ArrayList;
import java.util.List;

public class Program11 {
	public static void main(String[] args) {
		  List<String> l1 = new ArrayList<>();
			  l1.add("Ram");
			  l1.add("Geeta");
			  l1.add("Sita");
			  l1.add("Ram");
			  l1.add("Mohan");
			  l1.add("Sohan");
		   System.out.println("Before Stream API .......");
		   System.out.println(l1);
		   
		int sum=   l1.stream().mapToInt(n -> n.length()).sum();
		System.out.println(sum);
	}
}
