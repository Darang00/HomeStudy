package sec06.exam05.package2;

import sec06.exam05.package1.A;

public class C {
	//Constructor
	public C() {
		A a = new A();
		a.field1 = 1; // public 접근 제한자 접근 가능
		//a.field2 = 2; // default 필드 접근 불가(패키지가 다르므로, 컴파일 에러)
		//a.field3 = 3; // private 필드 접근 불가(컴파일 에러)
		
		a.method1(); // public 접근 제한자 접근 가능
		//a.method2(); // default 메소드 접근 불가(패키지가 다르므로, 컴파일 에러)
		//a.method3(); // private 메소드 접근 불가(컴파일 에러)
		
	}

}
