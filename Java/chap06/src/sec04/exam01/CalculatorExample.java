package sec04.exam01;

public class CalculatorExample {

	public static void main(String[] args) {
		Calculator myCalc = new Calculator(); // Creating object Calculator and it's address is put on variable myCarc
		myCalc.powerOn(); //Going to the object Calculator with the address in the variable myCalc and conducting method powerOn
		
		int result1 = myCalc.plus(5, 6);
		System.out.println("result1: " + result1);
		
		byte x = 10;
		byte y = 4;
		double result2 = myCalc.divide(x, y);
		System.out.println("result 2: " + result2);
		
		myCalc.powerOff();

	}

}
