package sec03.exam01;
public abstract class Phone {
	//field
	public String owner;
	
	//constructor
	public Phone(String owner){
		this.owner = owner;
	}
	
	//method
	public void turnOn() {
		System.out.println("Turnning on the phone");
	}
	public void turnOff() {
		System.out.println("Turnning off the phone");
	}
}
