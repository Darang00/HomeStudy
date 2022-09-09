package sec05.exam03;

public class Car {
	//Field(instance)
	int speed;
	
	//Field(static)
	static int superSpeed;
	
	//Method(instance)
	void run() {
		System.out.printf("instanceSpeed는 %d(km/h)으로 달립니다", speed);
	}
	
	static void superRun(){
		System.out.printf("staticSpeed는 %d(km/h)으로 달립니다%n", superSpeed);
	}

	public static void main(String[] args) {
		Car.superSpeed = 30; // Since superSpeed is static field, it should be declared with its class name 
		Car.superRun();
		
		Car myCar = new Car();
		myCar.speed=60;
		myCar.run();
		
		myCar.superSpeed = 50; // The static field Car.superSpeed should be accessed in a static way
	}
}
