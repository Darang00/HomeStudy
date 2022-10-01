package sec06.exam05.package1;

public class A {
	//Field
	public int field1; // public  접근 제한
	int field2; // default 접근 제한
	private int field3; // private 접근 제한
	
	//Constructor
	public A() {
		field1 = 1; 
		field2= 1;
		field3 = 3;
		
		method1();
		method2();
		method3();	
	}
	
	//Method
	public void method1() {} // public 접근 제한
	void method2() {} // default 접근 제한
	private void method3() {} // private 접근 제한

}
