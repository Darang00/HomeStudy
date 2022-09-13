package sec02.exam03;

public class Car {
	//Field
	Tyre frontLeftTyre = new Tyre("front_left", 6);
	Tyre frontRightTyre = new Tyre("front_right", 2);
	Tyre backLeftTyre = new Tyre("back_left", 3);
	Tyre backRightTyre = new Tyre("back_right", 4);
	
	//Constructor
	
	//Method
	int run() {
		System.out.println("The car is running");
		if(frontLeftTyre.roll()==false) {stop(); return 1;}
		if(frontRightTyre.roll()==false) {stop(); return 2;}
		if(backLeftTyre.roll()==false) {stop(); return 3;}
		if(backRightTyre.roll()==false) {stop(); return 4;}
		return 0;	
	}
	
	void stop() {
		System.out.println("The car is stopping");
	}
}
