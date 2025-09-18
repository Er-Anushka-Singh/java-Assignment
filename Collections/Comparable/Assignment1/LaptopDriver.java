package Comparable;
import java.util.*;

public class LaptopDriver {

	public static void main(String[] args) {
		Laptop L1 = new Laptop("Levo",50000.0,16);

		List<Laptop> l1= new ArrayList<>();
		l1.add(L1);
		l1.add(new Laptop("Hp", 70000.0,32));
		l1.add(new Laptop("Dell",60000.0,32));
		l1.add(new Laptop("Ausu",80000.0,32));
		
		for(Laptop L:l1)
			System.out.println(L);
		
		System.out.println("==========================");
		
		Collections.sort(l1);
		for(Laptop L:l1)
			System.out.println(L);
	
	}

}
