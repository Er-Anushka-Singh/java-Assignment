package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program10 {
	public static void main(String[] args) {
		  ArrayList<String> l1 = new ArrayList<>();
		  l1.add("Ram");
		  l1.add("Geeta");
		  l1.add("Sita");
		  l1.add("Ram");
		  l1.add("Mohan");
		  l1.add("Sohan");
		   System.out.println("Before Stream API .......");
		   System.out.println(l1);
		   
		   l1.stream().map(n -> n.toString()).distinct().forEach(n -> System.out.println(n));
		long l2 = l1.stream().map(n -> n.toString()).distinct().count();
		  System.out.println(l2);
	      
	}

}

