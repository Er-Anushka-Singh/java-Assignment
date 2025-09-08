  package CollectionFramework;
import java.util.*;

public class ProgramIterator3 {

	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<>();
		l1.add(45);
		l1.add(43);
		l1.add(34);
		l1.add(23);
		l1.add(22);
		l1.add(78);
		 System.out.println("Before remove.......");
		 System.out.println(l1);
		 
		 
		 // using for Each loop......
		 // It did not have remove option ConcurrentModification
		 for(Integer n: l1){
			 if(n%2==1)
			 l1.remove(n);
			}
		 System.out.println(l1);

	}

}


