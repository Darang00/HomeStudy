package sec02.exam03;

public class VehicleExample {
	public static void main(String[] args) {
		Vehicle vehicle = new Bus(); //다형성
		
		vehicle.run();
		//vehicle.checkFare(); // (X) Vehicle 인터페이스에는 checkFare()가 없음
		
		Bus bus = (Bus) vehicle; // Casting
		
		bus.run();
		bus.checkFare(); //Bus 클래스에는 checkFare() 메소드가 있음
	}
}
