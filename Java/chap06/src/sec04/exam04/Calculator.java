package sec04.exam04;

public class Calculator {
	int plus(int x, int y) {
		int result = x + y;
		return result;// Returning int type of variable, result
	}
	
	double avg(int x, int y) { // double type of method, avg
		double sum = plus(x,y); // Calling the method, plus()
		double result = sum/2 ;
		return result;
	}
	
	void execute() { // void type of method, execute
		double result = avg(7, 10); // Calling the method, ave()
		println("Conducting result is " + result); // Calling the method, println()
	}
	
	void println(String message) { // void type of method, println and the parameter is String type of 'message'
		System.out.println(message);
	}
}
