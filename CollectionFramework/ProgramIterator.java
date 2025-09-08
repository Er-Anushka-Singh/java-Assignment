  package CollectionFramework;
import java.util.*;

public class ProgramIterator {

	public static void main(String[] args) {
		List<String> l1= new ArrayList<>();
		l1.add("Geeta");
		l1.add("Rita");
		l1.add("Mohit");
		l1.add("Queen");
		l1.add("Rohit");
		// for each
		for (String n : l1) {
			System.out.print(n +" ");
		}
		
		
		// Lamada Expression
      l1.forEach(n -> System.out.println(n));
		
      // Iterator
		Iterator itr = l1.iterator();
		while(itr.hasNext()) {
		 System.out.println(itr.next());	}

	}

}


