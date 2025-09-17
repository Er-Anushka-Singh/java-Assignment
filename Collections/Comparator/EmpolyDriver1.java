package Collections.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmpolyDriver1 {
		public static void main(String[] args) {
			Empoly e = new Empoly("Ram",201,23490.0);
			List<Empoly> l1 = new ArrayList<>();
			l1.add(e);
		     l1.add(new Empoly("Gita",200,25490.0));
			l1.add(new Empoly("Ashu",202,24490.0));
			l1.add(new Empoly("Manmohan",190,22000.0));
			
			System.out.println("================================");
			for(Empoly e1:l1)
				System.out.println(e1);
			System.out.println("================================");
			
			Collections.sort(l1, Comparator.comparingDouble((Empoly e2)->e2.salary).reversed());
			for(Empoly e2:l1)
				System.out.println(e2);
		     
		}

	}



