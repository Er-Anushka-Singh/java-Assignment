package ExceptionHandling;

public class Program3 {

	public static void main(String[] args) {
		Object x ="Mohan";
		String s = (String)x;
		System.out.println(s.length());
		
		//OR
		System.out.println(((String)x).length());

	}

}
