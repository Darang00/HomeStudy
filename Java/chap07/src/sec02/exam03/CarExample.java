package sec02.exam03;

public class CarExample {

	public static void main(String[] args) {
		//Creating object, Car
		Car car = new Car();
		
		//Conducting run()method of object, Car
		for(int i=1; i<=5; i++) {
			int problemLocation = car.run();
		
		switch(problemLocation) {
		case 1:
			System.out.println("front_left changes to HankookTire");
			car.frontLeftTyre = new HankookTyre("front_left", 15);
			break;
		case 2:
			System.out.println("front_right changes to HankookTire");
			car.frontLeftTyre = new HankookTyre("front_right", 15);
			break;
		case 3:
			System.out.println("back_left changes to KumhoTire");
			car.frontLeftTyre = new KumhoTyre("back_left", 15);
			break;
		case 4:
			System.out.println("back_right changes to KumhoTire");
			car.frontLeftTyre = new KumhoTyre("back_right", 15);
			break;
		
		}
		System.out.println("-----------------");
		}
	}
}
