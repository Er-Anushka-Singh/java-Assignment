package ListInterface;


import java.util.Arrays;

public class ListInterfaceProgram6 {

	public static void main(String[] args) {
		int [] a= {34,56,78};
		int [] b = {34,56,78};
		int [] c= {78, 56,34,};
		
		int e=Arrays.mismatch(a, b);
		System.out.println(e);
	int d=	Arrays.mismatch(b, c);
	System.out.println(d);

	}

}
