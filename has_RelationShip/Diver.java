package has_RelationShip;

 class Diver {
	public static void main(String[] args) {
		House h = new House();
		System.out.println(h);
		System.out.println(h.b);
		h.b.switchOn();
		h.b.switchOff();
		
		System.out.println(h.b.brand);

	}

}
  

