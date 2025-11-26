package objectClass.deepCopy;

public class EmployDriver {
	

	public static void main(String[] args) throws CloneNotSupportedException {
	       Employ e1 = new Employ("Riya",121,new Address("Noida","UP"));
	       System.out.println(e1);
	       System.out.println(e1.a);
	       Employ e2=e1.clone();
	       System.out.println(e2);
	       System.out.println(e2.a);
	       System.out.println("======= Before Deep copy method call ==========");
	       System.out.println("E1 city : "+e1.a.city);
	       System.out.println("E2 city : "+e2.a.city);
	       
	       e2.a.city = "Kanpur"; 
	       System.out.println("======= After Deep copy method call ==========");
	       System.out.println("E1 city : "+e1.a.city);
	       System.out.println("E2 city : "+e2.a.city);

	}

}
