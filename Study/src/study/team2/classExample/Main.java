package study.team2.classExample;

import java.util.Scanner;

class Day{
	//Field
	private String work; //하루의 할 일을 나타내는 문자열
	
	//Method
	public void set(String work) {
		this.work = work;
	}
	public String get() {
		return work;
	}
	
	public void show() {
		if(work == null) {
			System.out.println("Nothing");
		} else {
			System.out.println(work);
		}
	}	
}

class MonthSchedule{
	Scanner scanner = new Scanner(System.in);
	
	//Field
	Day[] day = null;
	int Daily;
	String toDo;
	int days;
	
	//Constructor
	MonthSchedule(int days){
		this.days = days;
		day = new Day[days];
		
		for(int i = 0; i<day.length; i++) {
			day[i] = new Day();
		}
	}
	
	//Method
	public void input() {
		System.out.printf("Date (1~%d)? ", days);
		Daily = Integer.parseInt(scanner.next());
		System.out.println();
		
		System.out.println("Enter your plan (No blank)? ");
		toDo = scanner.next();
		day[Daily].set(toDo);
	}
	
	public void view() {
		System.out.printf("Date (1~%d)?" , days);
		Daily = scanner.nextInt();
		System.out.println();
	
	
	//System.out.printf("The schedule on %d th is %s %n", Daily, day.show());
	System.out.printf("The schedule on %d th is ", Daily);
	day[Daily].show();
	System.out.println();
}
	
	public void finish() {
		System.out.println("Finishing the program");
		System.exit(0);
		}
	
	public void run() {
		System.out.println("Schedule Management Program in this month");
		System.out.println("Plan(Entering: 1, Viewing: 2, Finishing: 3) >> ");
		switch(Integer.parseInt(scanner.next())) {
		case 1: 
			input();
			
			run();
			break;
			
		case 2:
			view();
			
			run();
			break;
			
		case 3:
			finish();
			break;
			
		default :
			System.out.println("Enter the valid option number");
			run();
			break;
			
		}
	}
	}




public class Main {
	public static void main(String[] args) {
	MonthSchedule april = new MonthSchedule(31); //4월달에 할 일
	april.run();
	
	}
}


