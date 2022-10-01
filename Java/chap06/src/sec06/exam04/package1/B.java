package sec06.exam04.package1;

public class B {
	//Field
	A a1 = new A(true); // public 접근 제한
	A a2 = new A(1); // default 접근 제한
	//A a3 = new A("문자열"); // 컴파일 에러: private 생성자 접근 불가 // The constructor A(String) is not visible

}
