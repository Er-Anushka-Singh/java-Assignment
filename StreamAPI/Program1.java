  package StreamAPI;
import java.util.ArrayList;

public class Program1 {


	public static void main(String[] args) {
		ArrayList<Integer> l1 = new ArrayList<>();
		l1.add(23);
		l1.add(35);
		l1.add(46);
		l1.add(89);
		l1.add(56);
		System.out.println("Before apply Steam .....");
		System.out.println(l1);
		l1.stream().forEach(n-> System.out.println(n));
//        Stream            Terminal
//        Creation          Operation
	}

}


