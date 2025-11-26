package generics;

public class Box1Driver {

	public static void main(String[] args) {
		
		Box1<Integer , Double, String> b1 = new Box1<>(12,23.6,"abc");
		
		
		System.out.println(b1);
		b1.getDetails();
		
		
		System.out.println(b1.e);
		System.out.println(b1.p);
		System.out.println(b1.q);
		

	}

}
