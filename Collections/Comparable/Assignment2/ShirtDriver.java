package Comparable;
import java.util.*;
public class ShirtDriver {

	public static void main(String[] args) {
		Shirt S1 = new Shirt("Nike",2500.0,42);
		List<Shirt> l1= new ArrayList<>();
		l1.add(S1);
		l1.add(new Shirt ("Adidas",2000.0,40));
		l1.add(new Shirt ("Puma",1800.0,41));
		l1.add(new Shirt ("Reebok",2200.0,39));
		l1.add(new Shirt ("BlackBarry",3000.0,42));
		
		for(Shirt S :l1)
			System.out.println(S);
		System.out.println("====================================");
		
    // This is done by comparable 
    // comparable ->  through this we can compare only on the basic of one attribute.
		Collections.sort(l1);
		for(Shirt S:l1)
			System.out.println(S);

	}

}
