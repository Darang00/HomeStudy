package sec02.exam03;

public class Bus implements Vehicle{
	@Override
	public void run() {
		System.out.println("The bus is running");
	}
	
	public void checkFare() {
		System.out.println("Checking the entry fee");
	}
}
