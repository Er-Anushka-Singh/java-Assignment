package generics;

import java.util.ArrayList;

public class AnimalDriver {

	public static void main(String[] args) {
		Animal a= new Animal();
		PetAnimal p=new PetAnimal();
		Dog d= new Dog();
		Pug pg =new Pug();
		Table t = new Table();
		
		ArrayList<Object> list1= new ArrayList<>();
		list1.add(a);list1.add(p);list1.add(d);list1.add(pg);list1.add(t);
		
		ArrayList<Animal> list2= new ArrayList<>();
		list2.add(a);list2.add(p);list2.add(d);list2.add(pg);
		
		ArrayList<PetAnimal> list3= new ArrayList<>();
		list3.add(p);list3.add(d);list3.add(pg);
		
		ArrayList<Dog> list4= new ArrayList<>();
		list4.add(d);list4.add(pg);
		
		ArrayList<Pug> list5= new ArrayList<>();
		list5.add(pg);
		
		eat(list1);
		eat(list2);
		eat(list3);
		eat(list4);
		eat(list5);
	}
	
	//Normal method
	public static void eat(ArrayList a) {
		System.out.println("Animal Eat !....");
	}
	
	//Unbounded generics 
	/*
	public static void eat(ArrayList<?> a) {
		System.out.println("Animal Eat !....");
	}
	*/
	//UpperBounded generics
	/*public static void eat(ArrayList<? extends Animal> a) {
		System.out.println("Animal Eat !....");
	}*/
	
	//LowerBound generics
	/* public static void eat(ArrayList<? super PetAnimal> a) {
		System.out.println("Animal Eat !....");
	}*/
	

}
