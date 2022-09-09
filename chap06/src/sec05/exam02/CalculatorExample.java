package sec05.exam02;

public class CalculatorExample {

	public static void main(String[] args) {
		double result1 = 10*10*Calculator.pi;
		
		int result2 = Calculator.plus(5, 127);
		
		int result3 = Calculator.minus(5, 127);
		
		System.out.printf("The result1 is %f %n", result1);
		System.out.printf("The result2 is %d %n", result2);
		System.out.printf("The result3 is %d %n", result3);

	}

}
