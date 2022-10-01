package sec01.exam06;

public class Car {
	//Field
	public int speed;
	
	//Method
	public void speedUp() {speed +=1;}
	
	//final method
	public final void stop() {
		System.out.println("Stopping car");
		speed = 0;
	}
}
