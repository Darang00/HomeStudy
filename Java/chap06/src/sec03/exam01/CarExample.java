package sec03.exam01;

public class CarExample {

	public static void main(String[] args) {
		
		//생성자 호출
		Car mycar = new Car("White", 2500);
		
		//기본 생성자 호출할 수 없음(Car 클래스에서 생성자 선언했으므로)
		//Car myCar = new Car() ; >> (X)

	}

}
