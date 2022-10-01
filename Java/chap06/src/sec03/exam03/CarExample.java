package sec03.exam03;

public class CarExample {

	public static void main(String[] args) {
		Car car1 = new Car();
		System.out.println("car1.company : " + car1.company);
		System.out.println();
		
		Car car2 = new Car("SUV"); // 매개변수가 String 타입이므로 Car class의 생성자 중 매개변수가 하나이며 String타입인 생성자를 호출
		System.out.println("car2.company : " + car2.company);
		System.out.println("car2.model : " + car2.model);
		System.out.println();
		
		Car car3 = new Car("SUV", "pink"); // 매개변수가 둘 다 String 타입이므로 Car class의 생성자 중 매개변수가 둘 다 String타입인 생성자 호출
		System.out.println("car3.company : " + car3.company);
		System.out.println("car3.model : " + car3.model);
		System.out.println("car3.colour : " + car3.colour);
		System.out.println();
		
		Car car4 = new Car("SUV" , "pink", 420); //매개변수가 String타입 두 개, int 타입 한 개 이므로 Car class의 생성자 중 이와 같은 생성자 호출
		System.out.println("car4.company : " + car4.company);
		System.out.println("car4.model : " + car4.model);
		System.out.println("car4.colour : " + car4.colour);
		System.out.println("car4.maxSpeed : " + car4.maxSpeed);
		System.out.println();
		
	}

}
