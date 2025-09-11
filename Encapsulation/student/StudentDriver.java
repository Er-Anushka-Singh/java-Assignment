package Encapsulation.student;
import java.util.Scanner;

public class StudentDriver {

	public static void main(String[] args) {
	       Scanner sc = new Scanner(System.in);
	       
	       System.out.println("Enter the name : ");
	       String name1= sc.nextLine();
	       
	       System.out.println("Enter the course : ");
	       String course1 = sc.nextLine();
	       
	       System.out.println("Enter the mobile Number : ");
	       String mobileNumber =sc.nextLine();
	       
	       Student s1 = new Student();
	       
	       s1.setName(name1);
	       s1.setCourse(course1);
	       s1.setMobileNumber(mobileNumber);
	       
	       System.out.println("========================");
	       
	       System.out.println(s1.getName());
	       System.out.println(s1.getCourse());
	       System.out.println(s1.getMobileNumber());

	}

}

