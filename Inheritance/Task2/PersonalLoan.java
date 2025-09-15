package Inheritance.Task2;

public class PersonalLoan extends Loan {
	
	String employmentType ; // salaried , self-Employed
	double monthlyIncome;
	String purpose;
	boolean isGuarantorRequired;
	
	
	PersonalLoan(){
		
	}
	
    PersonalLoan(int id, String borrowerName, double amount , int loanTerm , double intrestRate,
    		String employmentType , double monthlyIncome , String purpose){
    	
    	  super(id,borrowerName,amount, loanTerm ,intrestRate);
	   	this.employmentType=employmentType;
		this.monthlyIncome=monthlyIncome;
		this.purpose=purpose;
		
	}
    
    PersonalLoan(String employmentType , double monthlyIncome , String purpose, boolean isGurantorRequired){
    	this.employmentType=employmentType;
		this.monthlyIncome=monthlyIncome;
		this.purpose=purpose;
		this.isGuarantorRequired=isGuarantorRequired;
    }

    public String getDetails() {
    	
    	return super.getDetails()+"\nEmployment Type : "+employmentType+
    			"\nMonthly Income : "+monthlyIncome+"\nPuropse : "+purpose+"\nisGuarantorRequired : "+isGuarantorRequired;
    }

}
