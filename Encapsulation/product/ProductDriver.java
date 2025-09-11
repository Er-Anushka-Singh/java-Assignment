package Encapsulation.product;

import java.util.Scanner;

public class ProductDriver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Take user input
		System.out.println("Enter the name of Product : ");
		String name1 = sc.nextLine();
		
		System.out.println("Enter the brand of Product : ");
		String brand1 = sc.nextLine();
		
		System.out.println("Enter the price of Product : ");
		double price1 = sc.nextDouble();
		
		Product p1 = new Product();
		
		// Set All the detailes
		p1.setName(name1);
		p1.setBrand(brand1);
		p1.setPrice(price1);
		
		System.out.println("=====================");
		
		// Get All the detailes
		System.out.println(p1.getName());
		System.out.println(p1.getBrand());
		System.out.println(p1.getPrice());
		

	}

}
