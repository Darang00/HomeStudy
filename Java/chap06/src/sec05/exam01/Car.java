package sec05.exam01;

public class Car {
	//Field
	String model;
	int speed;
	
	//Constructor
	Car(String model){
		this.model = model;
	}
	
	//Method
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void run() {
		for(int i=10; i<=50; i+=10) {
			this.setSpeed(i);
			System.out.printf("%s가 달립니다. (시속 : %d km/h)%n", this.model, this.speed);
		}
	}
}
