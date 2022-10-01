package sec01.verify.exam05;

public class Child extends Parent{
	//Field
	private String name;
	
	//Constructor
	public Child() {
		this("Dayoeng");
		System.out.println("Child() call");
	}
	
	public Child(String name) {
		this.name=name;
		System.out.println("Child(String name call");
	}
	
}
