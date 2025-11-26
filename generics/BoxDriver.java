package generics;

public class BoxDriver {

	public static void main(String[] args) {
	
		
		Box b1 = new Box(12); // But it is unSafe and it give warnning . It give problem in future.
		Box<Integer> b2= new Box<>(23);
		Box<Double> b3 = new Box<>(34.7);
		// Box<int> b4 = new Box<>(9);  We can't give perimitive type data.
		Box<String> b4 = new Box<>("abc");
		
		System.out.println(b1.get());
		System.out.println(b2.get());
		System.out.println(b3.get());
		System.out.println(b4.get());

	}

}
