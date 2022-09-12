package study.team2.inheritExample;

import java.util.Scanner;

abstract class Converter {
	//abstract method
	abstract protected double convert(double src);
	abstract protected String getSrcString(); 
	abstract protected String getDestString();
	protected double ratio; 
	
	//public method
	public void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(getSrcString() + "을 " + getDestString() + "로 바꿉니다");
		System.out.println(getSrcString() + "을 입력하세요>> ");
		double val = scanner.nextDouble();
		double res = convert(val);
		System.out.println("변환 결과: "+ res + getDestString()+ "입니다");
		scanner.close();
		
	}

}
