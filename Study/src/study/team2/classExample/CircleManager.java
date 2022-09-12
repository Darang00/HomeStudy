package study.team2.classExample;

import java.util.Scanner;

class Circle {
	//Field
	private double x, y;
	private int radius;
	
	//Constructor
	public Circle (double x, double y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	//Method
	public void show() {
		System.out.printf("( %.1f, %.1f ) %d %n", x, y, radius);
	}
	
}

public class CircleManager{
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		Circle[] c = new Circle[3]; //3개의 Circle 배열 선언
		for(int i = 0; i<c.length; i++) {
			System.out.print("x, y, radius >>"); //x, y, radius 값 읽기
			c[i] = new Circle (scanner.nextDouble(),scanner.nextDouble(), scanner.nextInt());
			
		}
		
		for (int i = 0; i<c.length; i++) {
			c[i].show();
			scanner.close();
		}
		
	}
}
