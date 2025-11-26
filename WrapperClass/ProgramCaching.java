package wrapperClass;

public class ProgramCaching {

	public static void main(String[] args) {
		
		//Here, In range between (-127 to 127)number  new object will not create so it can compare by (==) and return true.  
		
		Integer x=100;
		Integer y=100;
		
		System.out.println("x==y : =>"+(x==y));
		System.out.println("x.equals.(y) =>"+(x.equals(y)));
		
		System.out.println("==========================");
		//Here, In range beyond this (-127 to 127)number  new object will  create so it can compare by (==) and return false.  
		
		Integer a=1000;
		Integer b=1000;
		System.out.println("a==b : =>"+(a==b));
		System.out.println("a.equals.(b) =>"+(a.equals(b)));
	}

}
