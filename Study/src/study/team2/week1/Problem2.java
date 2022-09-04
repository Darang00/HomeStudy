package study.team2.week1;

import java.util.Scanner;

public class Problem2 {
	//2. 2자리의 정수값(10~99)을 맞추는 '숫자 맞추기 게임'을 만들자. 난수생성과 if문 그리고 do 문을 사용할것. 문제4-3 (110p)
	
	public static void main(String[] args) {
		
		int target = (int)((Math.random() * 89 ) + 10) ;
		// System.out.println(target);
		Scanner sc = new Scanner (System.in); 
		int number;  
		
		do {
		System.out.println("Enter a number between 10 to 99"); 
		number = Integer.parseInt(sc.nextLine());
		
		if (number > target ) {
			System.out.println("down");
		} else if (number < target) {
			System.out.println("up");
		} else if (number == target) {
			System.out.println(number + " is correct");
		}
		
		} while (target != number) ; 
			
		
		
		
		
		

	}

}
