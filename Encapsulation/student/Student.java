package Encapsulation.student;

public class Student {
	
   private String name;
   private String course;
   private String mobileNumber;
   
   public void setName(String name) {
	   if(name.length()>2 && name.matches("[A-Za-z\s]+")) {
		   System.out.println("Valid Name");
		   this.name=name;
	   }else {
		   System.out.println("Invalid Name");
	   }
   }
   
   public void setCourse(String course) {
	   if(course.length()>2 && course.matches("[A-Za-z\s]+")) {
		   System.out.println("Valid Course");
		   this.course=course;
	   }
	   else {
		   System.out.println("Invalid Course");
	   }
   }
   
   public void setMobileNumber(String mobileNumber) {
	   if(mobileNumber.length()==10) {
		   System.out.println("Valid Mobile number");
		   this.mobileNumber=mobileNumber;
	   }
	   else {
		   System.out.println("Invalid Mobile Number");
	   }
   }
   
   public String getName() {
	   return name;
   }
   
   public String getCourse() {
	   return course;
   }
   
   public String getMobileNumber() {
	   return mobileNumber;
   }

}

