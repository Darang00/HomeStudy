package study.team2.week1;

import java.util.Scanner;

public class Problem3 {
	//3. 양의정수값을 읽어서 그 자릿수를 출력하는 프로그램 작성.문제 4-9 (123p)
	
	public static void main(String[] args) {
		System.out.println("Enter a positive integer number");
		
		Scanner sc = new Scanner (System.in);
		int num = Integer.parseInt(sc.nextLine());
		
		int share = 10;
		int portion ;
		//int rest;
		
		
		
		
		for (portion = 1 ; (num%share) !=0 ; portion ++  ) {
			for (share =10 ; (num%share) != 0 ; share*=10) {
				System.out.println(portion + "번쨰 자리 수는 " + (num%share) + "입니다.");	
			}
			
		if ((num%share) == 0) {
			break;
		}	
		
		
		
		if (num%share == 0) {
			break;
		}
		}
		
		
		
/////////////////////////
	}

}
