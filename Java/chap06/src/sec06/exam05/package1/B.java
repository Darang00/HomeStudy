package sec06.exam05.package1;

public class B {
	public B() {
		A a = new A();
		a.field1 = 0; // public  접근 제한 접근 가능
		a.field2 = 1; // default 접근 제한 접근 가능
		//a.field3 = 2; // private 필드 접근 불가능(컴파일 에러)
		
		a.method1(); // public  접근 제한 접근 가능
		a.method2(); // default 접근 제한 접근 가능
	//	a.method3(); // private 메소드 접근 불가능(컴파일 에러)
	}
}
