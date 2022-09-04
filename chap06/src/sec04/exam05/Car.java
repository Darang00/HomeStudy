package sec04.exam05;

public class Car {
	//Field
	int speed;
	
	//Constructor
	
	//Method
	int getSpeed() {
		return speed;
	}
	
	void keyTurnOn() {
		System.out.println("Turnning on the key");
	}
	
	void run() {
		for(int i=0; i<=50; i+=10) {
			speed = i;
			System.out.println("Running (speed per hour is " + speed + "km/h");
		}
	}
}

