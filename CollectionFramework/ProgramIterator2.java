package CollectionFramework;
import java.util.*;

public class ProgramIterator2 {

	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<>();
		l1.add(23);
		l1.add(56);
		l1.add(89);
		l1.add(34);
		l1.add(35);
		l1.add(44);
		l1.add(45);
		System.out.println("Before remove! ...........");
		System.out.println(l1);
		

		// by using Indexing For loop.............. 
		for(int i=0; i<l1.size(); i++) {
			if(l1.get(i)%2==1) {
				l1.remove(i);
				i--;
			}
		}
		System.out.println("After remove 1st time! .........");
		System.out.println(l1);
			
			
		// by using element in For loop........
			for(int j=0; j<l1.size(); j++) {
					l1.remove(l1.get(j));		
			}
		
		System.out.println("After remove! .........");
		System.out.println(l1);
		
		
	}

}


