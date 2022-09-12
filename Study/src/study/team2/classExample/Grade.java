package study.team2.classExample;

import java.util.Scanner;

public class Grade {
	//Field
	private int math;
	private int science;
	private int english;
	
	//Constructor
	Grade(int math, int science, int english){
		this.math = math;
		this.science = science;
		this.english = english;
	}
	
	//Method
	int average() {
		return (math+science+english)/3;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the marks of math, science and english >> ");
		int math = scanner.nextInt(); 
		int science = scanner.nextInt();
		int english = scanner.nextInt();
		
		Grade me = new Grade(math, science, english);
		System.out.println("The average score is " + me.average()); //average()는 평균을 계산하여 return
		
		scanner.close();
	}

}
