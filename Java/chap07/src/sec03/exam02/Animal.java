package sec03.exam02;

public abstract class Animal { //Declaring abstract class
	//field
	public String kind; 
	
	//method
	public void breathe() {
		System.out.println("Breathing");
	}
	//abstract method
	public abstract void sound();
	
}
