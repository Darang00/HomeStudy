package sec04.exam01;

public class Calculator {
	
	//Method
	void powerOn() { //void is return type which means it return nothing
		System.out.println("Power On");
	}
	
	int plus(int x, int y) { //Returning value of int type
	int result = x + y;
	return result;
	}
	
	double divide(int x, int y) { // Returning value of double type
		double result = (double)x/(double)y;
		return result;
	}
	
	void powerOff() { //Returning nothing
		System.out.println("Power Off");
	}
}
