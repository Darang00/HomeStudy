package sec02.exam03;

public class KumhoTyre extends Tyre{
	//Field
	
	//Constructor
	KumhoTyre(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	//Method
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.printf("%s KumhoTyre lifespan is %d times %n", location, (maxRotation-accumulatedRotation));
			return true;
		}else {
			System.out.printf("*** %s KumhoTyre has puncture %n", location);
			return false;
		}
	}
}
