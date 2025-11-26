package generics;

public class Box<E> {
	
	E e;
	 
	Box(E e){
		this.e=e;
	}
	
	public E get() {
		return e;
	}

}
