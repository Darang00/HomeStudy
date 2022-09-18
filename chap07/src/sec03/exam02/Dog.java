package sec03.exam02;

public class Dog extends Animal{
	//field
	public Dog() {
		this.kind = "Mammal";
	}
	
	//method
	@Override // redeclaring the abstract method
	public void sound() {
		System.out.println("Bow-wow");		
	}
}
