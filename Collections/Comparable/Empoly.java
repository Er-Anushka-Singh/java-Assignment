package Collections.Comparable;

public class Empoly implements Comparable<Empoly1> {

		
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
		
		public int compareTo(Empoly1 e) {
			return Integer.compare(this.id, e.id);
		}
	}



