package Inheritance.Task2;

public class Loan {
	
	int id;
	String borrowerName;
	double amount;
	int loanTerm;
	double intrestRate;
	
	Loan(){
		
	}
	
	Loan(int id , String borrowerName, double amount){
		this.id=id;
		this.borrowerName=borrowerName;
		this.amount=amount;
	}

	Loan(int id, String borrowerName, double amount , int loanTerm , double intrestRate){
		this(id,borrowerName,amount);
		this.loanTerm=loanTerm;
		this.intrestRate=intrestRate;
	}
	
	public String getDetails() {
		return "Id is : "+id+"\nBorrowerName is : "+borrowerName+"\nAmount is : "+amount+
				"\nLoan Term is : "+loanTerm+" Years"+"\nIntrest Rate is : "+intrestRate+" %";
	}
}
