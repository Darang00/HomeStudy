package sec03.exam02;

public class Cat extends Animal{
	//field
	public Cat() {
		this.kind = "Mammal";
	}
	
	//method
	@Override //redeclaring the abstract method
	public void sound() {
		System.out.println("Meowww");
	}
}
