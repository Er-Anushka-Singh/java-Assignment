package StreamAPI;
import java.util.*;

public class Program2 {


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
	   
	   
	   //  This change can't done in original List....
	   l1.stream().filter(n-> n%2==0).forEach(n -> System.out.println(n));

	}

}
