package sec04.exam03;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.setGas(5); // Calling method setGas() of class Car
		
		boolean gasState = myCar.isLeftGas(); // Calling method isLeftGas() of clas Car
		if(gasState) {
			System.out.println("Departure");
			myCar.run(); // Calling method method run() of class Car
		}
		
		if(myCar.isLeftGas()) { //Calling method isLeftGas() of class Car
			System.out.println("You don't need to get more gas");
		} else {
			System.out.println("Get more Gas");
		}
	}

}
