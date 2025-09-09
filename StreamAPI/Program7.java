package StreamAPI;
import java.util.*;
import java.util.stream.Collectors;

public class Program7 {

		public static void main(String[] args) {
			  ArrayList<Integer> l1 = new ArrayList<>();
			   l1.add(34);
			   l1.add(18);
			   l1.add(89);
			   l1.add(16);
			   l1.add(90);
			   l1.add(34);
			   l1.add(56);
			   l1.add(18);
			   l1.add(16);
			   System.out.println("Before Stream API .......");
			   System.out.println(l1);
			   
			   
			 l1=   (ArrayList<Integer>) l1.stream().filter(n -> n%2==0).distinct().collect(Collectors.toList());
			  System.out.println("After Stream API and distinct..........");
			 System.out.println(l1);
			 
			 //OR
			 List<Integer> l2=  l1.stream().filter(n -> n%2==0).distinct().collect(Collectors.toList());
		     System.out.println(l2); 
		}

	}



