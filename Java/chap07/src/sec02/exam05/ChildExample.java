package sec02.exam05;

public class ChildExample {
	public static void main(String[] args) {
		Parent parent = new Child(); //자동 타입 변환
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		/* 부모가 자식의 필드나 메소드에는 접근 불가능 (에러)
		 parent field2 = "data";
		 parent.method3();
		 */
		
		//강제 타입 변환(casting) 후 부모가 자식의 자원에 접근 가능
		Child child = (Child) parent; //강제 타입 변환
		child.field1 = "I can access my parent's field";
		child.field2 = "I can access my field";
		child.method1();
		child.method2();
		child.method3();			
	}
}
