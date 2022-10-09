package sec02.exam01;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.run();
		
		myCar.frontLeftTyre = new KiaTyre();
		myCar.frontRightTyre = new KiaTyre();
		
		myCar.run();
	}
}
