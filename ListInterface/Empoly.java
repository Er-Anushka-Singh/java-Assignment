package ListInterface;

public class Empoly {
	
	String name ;
	int id;
	double salary;
	
	Empoly(){
		
	}
	Empoly(String name , int id , double salary){
		this.name=name;
		this.id=id;
		this.salary=salary;
	}

	public String toString() {
		return "Name is : "+name+ "\tId is : "+id+"\tSalary is : "+salary;
	}
}

