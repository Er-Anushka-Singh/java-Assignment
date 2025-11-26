package wrapperClass.objectReference;

public class Program1 {

	public static void main(String[] args) {
	
		Object o1 = "abc";
		Object o2=23;
		Object o3=34.6;
		Object o4= true;
		Object o5= '@';
		//Object o6=new Car();
		//Object o7 = new Animal();
		
		
		// Here we get only object class method .To get Child class value such as(Integer , Double ) we have to do downCasting.
		
		System.out.println(o1);
	//	System.out.println(o1+100);    It will give error didn't concatenate.
		
		String s1 =(String)o1;
		System.out.println(s1+100);
		
		System.out.println("================");
		
		System.out.println(o2);
		//System.out.println(o2+100);   It will give error didn't add.
		
		Integer i=(Integer)o2;
		System.out.println(i+100);
		
		
		
	}

}
