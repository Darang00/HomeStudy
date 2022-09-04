package sec04.exam02;

public class Computer {
	
	//Method sum1
	int sum1(int[] values) { //int type method sum1 and its parameter is array 'values'
		int sum = 0;
		for(int i = 0; i<values.length; i++) {
			sum += values[i];
		}
		 return sum;
	}

	//Method sum2
	int sum2(int ...values) {
		int sum = 0;
		for(int i = 0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}

	
}
