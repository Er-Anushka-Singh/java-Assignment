package wrapperClass;

public class Program4 {

	public static void main(String[] args) {
			String s1 = "234";
			System.out.println(s1);
			System.out.println(s1+100);
			System.out.println("--------------------");
			
			int i= Integer.parseInt(s1);
			int j=Integer.valueOf(s1);
			
			System.out.println(i);
			System.out.println(j);
			System.out.println(i+100);
			System.out.println(j+100);

	}

}
