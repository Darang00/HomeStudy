package sec03.exam01;

public class PhoneExample {
	public static void main(String[] args) {
		//Phone phone = new Phone(); // Phone은 추상 클래스이므로 생성자를 호출하여 객체 생성 불가능
		//대신 자식 클래스인 SmartPhone으로 객체를 생성해서 Phone의 method인 turnOn(), turnOff 메소드 사용
		
		SmartPhone smartPhone = new SmartPhone("Dayeong");
		
		smartPhone.turnOn(); //"Phone"(추상 클래스(부모))의 method
		smartPhone.internetSearch();
		smartPhone.turnOff();
		System.out.println("The owner of the smartPhone is " + smartPhone.owner);
	}

}
