package Inheritance.Task2;


public class PersonalLoanDriver {

	public static void main(String[] args) {
		PersonalLoan p1= new PersonalLoan(101,"Ramesh", 500000,2, 10,
				"Salaried", 60000,"Health Bad Condition");
		
		System.out.println(p1.getDetails());
		System.out.println("============================");
		
		PersonalLoan p2= new PersonalLoan("Salaried", 60000,"Health Bad Condition",true);
		System.out.println(p2.getDetails());
		
	}

}
