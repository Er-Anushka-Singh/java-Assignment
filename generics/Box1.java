package generics;

public class Box1 <E ,P,Q> {
	
	E e;
	P p;
	Q q;
	
	Box1(E e,P p, Q q){
		this.e=e;
		this.p=p;
		this.q=q;
	}
 
	public void getDetails() {
		System.out.println("1st details : "+e+"\t\t2nd details : "+p+"\t3rd details : "+q);
	}
	
	public String toString() {
		return "1st details : "+e+"\t\t2nd details : "+p+"\t3rd details : "+q;
	}
	
	public Box1<E,P,Q> get(){
		return new Box1<E,P,Q>(e,p,q);
	}
	

}
