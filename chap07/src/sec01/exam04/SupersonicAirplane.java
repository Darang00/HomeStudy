package sec01.exam04;

public class SupersonicAirplane extends Airplane {
	//Field
	public static final int NORMAL = 1; // constant
	public static final int SUPERSONIC = 2; // constant
	public int flyMode = NORMAL;
	
	//Method
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("Flying supersonic");
		} else {
			super.fly(); // Airplane 객체의 fly() 메소드 호출
		}
	}
}
