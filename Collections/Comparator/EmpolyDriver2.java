package Collections.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmpolyDriver2 {
		public static void main(String[] args) {
			Empoly e1 = new Empoly("Ram",201,23490.0);
			List<Empoly> l1 = new ArrayList<>();
			l1.add(e1);
		     l1.add(new Empoly("Gita",200,23490.0));
			l1.add(new Empoly("Ashu",202,23490.0));
			l1.add(new Empoly("Manmohan",190,23490.0));
			
			System.out.println("================================");
			for(Empoly e:l1)
				System.out.println(e);
			System.out.println("================================");
			
				Collections.sort(l1, Comparator.comparingDouble((Empoly e)->e.salary).thenComparing(e->e.name).thenComparingInt(e->e.id));
			for(Empoly e:l1)
				System.out.println(e);
		     
		}

	}



  

