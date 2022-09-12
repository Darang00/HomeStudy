package study.team2.classExample;

import java.util.Scanner;

class Circle2 {
	//Field
	private double x, y;
	private int radius;
	
	//Constructor
	public Circle2 (double x, double y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	//Method
	public void show() {
		System.out.printf("( %.1f, %.1f ) %d %n", x, y, radius);
	}
	
	public int getRadius() {
		return radius;
	}
}

public class CircleManager2{
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		Circle2[] c = new Circle2[3]; //3개의 Circle 배열 선언
		int max = 0;
		
		
		for(int i = 0; i<c.length; i++) {
			System.out.print("x, y, radius >>"); //x, y, radius 값 읽기
			c[i] = new Circle2 (scanner.nextDouble(),scanner.nextDouble(), scanner.nextInt());
			
		}
		
		for (int i = 0; i<c.length; i++) {
			if(max<c[i].getRadius()) {
				max = c[i].getRadius(); //c 배열 i번째 칸의 radius가 max 보다 크면 max에 그 radius 값 할당
			}
		}
			
		for (int i = 0; i<c.length; i++) {
			if(max==c[i].getRadius()) {
				System.out.print("The maximum area of the circles is ");
				c[i].show();
			}
		}
	
	}
}
