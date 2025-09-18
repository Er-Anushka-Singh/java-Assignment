package Collections.Comparable.Assignment3;

import java.util.*;

public class ProductDriver {

	public static void main(String[] args) {
	  Product P1 = new Product(" iPhone 15 Pro",13990.0,"Apple");
	  List<Product> l1 = new ArrayList<>();
	  l1.add(P1);
	  l1.add(new Product ("Galaxy S24 Ultra",129999.0,"Samsung"));
	  l1.add(new Product ("ThinkPad X1 Carbon",185999.0,"Levono"));
	  l1.add(new Product ("AirPods Pro",24500.0,"Apple"));
	  
	  for(Product P:l1)
		  System.out.println(P);
	  
	  System.out.println("================================");
	  
	  Collections.sort(l1);
	  for (Product P:l1)
		  System.out.println(P);

	}

}

