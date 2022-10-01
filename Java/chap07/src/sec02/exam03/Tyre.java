package sec02.exam03;

public class Tyre {
	//Field
	public int maxRotation; //maximum rotation(life span of tyre)
	public int accumulatedRotation; 
	public String location;
	
	//Constructor
	Tyre(String location, int maxRotation){
		this.location = location;
		this.maxRotation= maxRotation;
	}
	
	//Method
	public boolean roll() {
		++accumulatedRotation; //accumulated rotation is increased by 1
		if(accumulatedRotation<maxRotation) {
			System.out.printf("%s 's lifespan is %d times %n", location, (maxRotation-accumulatedRotation));
		return true;
		} else {
			System.out.printf("*** %s Tyre has pucture *** %n", location);
			return false;
		}
	}

}
