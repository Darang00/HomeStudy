package sec05.exam04;

public class Singleton {
	//Declare object Singleton
	private static Singleton singleton = new Singleton();
	
	//Constructor
	private Singleton() {} // No one change the field in Singleton from outside of this class
	
	static Singleton getInstance() {
		return singleton; // return the address of the object Singleton
	}

}
