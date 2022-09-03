package sec02.exam01;

public class CarExample {

	public static void main(String[] args) {
		
		// Creating objects
		Car myCar = new Car();
		
		// Reading values of fields
		System.out.println("Producing company: " + myCar.company );
		System.out.println("Model name: " + myCar.model );
		System.out.println("Colour: " + myCar.colour );
		System.out.println("Maximum Speed : " + myCar.maxSpeed );
		System.out.println("Current Speed: " + myCar.speed);
		
		//Changing filed values
		myCar.speed = 80;
		System.out.println("Changed speed is " + myCar.speed);
		

	}

}
