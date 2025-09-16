package Inheritance.Task3;


public class Electronics extends Product{
	
	String warranty;  // e.g. "2"
	double powerConsumption; // in watts
	String weight;
	
	Electronics(){
		super();
		
	}
	
	Electronics(int productId , String name , String brand,double price,
			String warranty,double powerConsumption){
		super(productId , name, brand );
		this.warranty=warranty;
		this.powerConsumption=powerConsumption;
	}
	
	Electronics(int productId , String name , String brand,double price,
			int stockQuantity, String weight){
		super(productId , name, brand ,price ,stockQuantity);
		this.weight=weight;
	}
	Electronics(int productId , String name , String brand,double price,
			int stockQuantity,String warranty,double powerConsumption,String weight){
		 super(productId , name, brand ,price ,stockQuantity);
		 this.warranty=warranty;
		 this.powerConsumption=powerConsumption;
		 this.weight=weight;
	}

	public String getDetails() {
		return super.getDetails()+"\nWarranty is : "+warranty+
				"\nPower Consumption is : "+powerConsumption+"\nWeight is : "+weight;
				}
}
