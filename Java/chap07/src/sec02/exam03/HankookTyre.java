package sec02.exam03;

public class HankookTyre extends Tyre{
	//Field
	
	//Constructor
	HankookTyre(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	//Method
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.printf("%s HankookTyre lifespan is %d times %n", location, (maxRotation-accumulatedRotation));
			return true;
		}else {
			System.out.printf("*** %s HankookTyre has puncture %n", location);
			return false;
		}
	}
}
