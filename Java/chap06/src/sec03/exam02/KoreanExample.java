package sec03.exam02;

public class KoreanExample {

	public static void main(String[] args) {
		
		
		Korean k1 = new Korean("JavaPark", "01012345678"); // k1 에는 Korean 객체의 주소값이 할당됨ㅏ
		System.out.println("k1.name : " + k1.name); // k1.name의 의미> k1에 저장된 Korean 객체의 주소를 찾아가서(.) 필드 name의 값
		System.out.println("k1.ssn : " + k1.ssn ); // k1.name의 의미> k1에 저장된 Korean 객체의 주소를 찾아가서(.) 필드 ssn의 값
		
		Korean k2 = new Korean("JavaKim", "01098765432"); // k2 에는 Korean 객체의 주소값이 할당됨
		System.out.println("k2.name : " + k2.name); 
		System.out.println("k2.ssn : " + k2.ssn );
		
		

	}

}
