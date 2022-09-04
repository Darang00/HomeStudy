package sec04.exam06;

public class CalculatorExample {

	public static void main(String[] args) {
		Calculator myCalcu = new Calculator();
		
		//Figuring the width of the square out
		double result1 = myCalcu.areaRectangle(10);
		
		//Figuring the width of the rectangle out
		double result2 = myCalcu.areaRectangle(10, 20);
		
		//Printing the result
		System.out.println("The width of the square is " + result1);
		System.out.println("The width of the rectangle is " + result2);
	}
}
