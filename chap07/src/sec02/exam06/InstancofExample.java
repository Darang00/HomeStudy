package sec02.exam06;

public class InstancofExample {
	public static void method1(Parent parent) {
		if(parent instanceof Child) { //"parent 참조변수가 가르키는 객체가 Child의 인스턴스니?(Child타입이니?)"
			Child child = (Child)parent;
			System.out.println("method1-Child로 변환 성공");//if의 조건문이 true일 경우 출력됨
		} else {
			System.out.println("method1-Child로 변환되지 않음");//if의 조건문이 false일 경우 출력됨
		}
	}
	
	public static void method2(Parent parent) {
		Child child = (Child) parent; //ClassCastException 발생할 가능성 있음
		System.out.println("method2-Child로 변환 성공");
	}
	
	public static void main(String[] args) {
		Parent parentA = new Child();
		
		//Child 객체를 매개값으로 전달
		method1(parentA);
		method2(parentA);
		
		//Parent 객체를 매개값으로 전달
		Parent parentB = new Parent();
		method1(parentB);
		method2(parentB); //예외 발생 //Exception in thread "main" java.lang.ClassCastException
	}
}
