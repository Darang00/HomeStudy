package sec03.exam04;

public class Car {
	
	//Field
	String company = "KIA";
	String model;
	String colour;
	int maxSpeed;
	
	//Constructor
	Car(){
		
	}
	
	Car(String model){
		this(model, "silver", 420);
	}
	
	Car(String model, String colour){
		this(model, colour, 420);
	}
	Car(String model, String colour, int maxSpeed){
		this.model = model;
		this.colour = colour;
		this.maxSpeed = maxSpeed;
	}
}
