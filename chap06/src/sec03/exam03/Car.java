package sec03.exam03;

public class Car {
	//Field
	
	String company = "KiA";
	String model;
	String colour;
	int maxSpeed;
	
	//Constructor
	Car(){
		
	}
	
	Car(String model){
		this.model = model;
	}
	
	Car(String model, String colour){
		this.model = model;
		this.colour = colour;
	}
	
	Car(String model, String colour, int maxSpeed){
		this.model = model;
		this.colour = colour;
		this.maxSpeed = maxSpeed;
	}

}
