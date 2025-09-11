package Encapsulation.laptop;

import java.util.Scanner;

public class LaptopDriver {

	public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
	       
	       System.out.println("Enter the name : ");
	       String name1= sc.nextLine();
	       
	       System.out.println("Enter the price : ");
	       double price1 = sc.nextDouble();
	       
	       System.out.println("Enter the Fast processing Ram : ");
	       int ram1 =sc.nextInt();
	       
	       Laptop l1 = new Laptop();
	       
	       l1.setName(name1);
	       l1.setPrice(price1);
	       l1.setRam(ram1);
	       
	       System.out.println("================");
	       
	       System.out.println(l1.getName());
	       System.out.println(l1.getPrice());
	       System.out.println(l1.getRam() +" GB");

	}

}
