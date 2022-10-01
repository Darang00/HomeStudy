package sec06.exam04.package2; // 패키지가 다름

import sec06.exam04.package1.A; // 다른 패키지에 있는 클래스 A를 사용한다고 선언

public class C {
	// Field
	A a1 = new A(true); // public 접근 제한 생성자 접근 가능
	//A a2 = new A(1); // default 접근 제한 생성자 접근 불가능(컴파일 에러)
	//A a3 = new A("문자열"); // private 접근 제한 생성자 접근 불가능(컴파일 에러)
}
