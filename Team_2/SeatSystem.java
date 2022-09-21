package com.victoree2.system;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SeatSystem {
	public String firstBraket = "[";
	//String blank = " ";
	//public String firstList;
	public int midNumi;
	public int midNumj;
	public String lastBraket = "]";	
	
	//public String[][] arr1 = new String[3][5];
	//public String[][] arr2 = new String[4][5];
	//public String[][] arr3 = new String[9][5];
	// int cnt = 0;
	static List<String[][]> room = new ArrayList<String[][]>(); //다형성 //열람실
	
	public String deskIndex1[][] = new String[3][7]; //좌석 번호 //세로열 [0~2], 가로열[0~6] 
	public String deskIndex2[][] = new String[4][6]; //좌석 번호 //세로열 [0~3], 가로열[0~5]
	public String deskIndex3[][] = new String[5][5]; //좌석 번호 //세로열 [0~6], 가로열[0~4]
	
	
	void seat() { //좌석 배열
			midNumi = 0;
			
			//1열람실 좌석 배열 arr1
			for (int i = 0; i <deskIndex1.length; i++) {
				if(i == 0) {
					System.out.println("*1열람실*");
				}
				for (int j = 0; j <deskIndex1[i].length; j++) {
					deskIndex1[i][j] =firstBraket + "1"  + (String.valueOf(midNumi)) + (String.valueOf(midNumj++)) + lastBraket;
					System.out.print(deskIndex1[i][j]);
				}
				midNumj = 0;
				String.valueOf(midNumi++);
				System.out.println();
				
				if(midNumi == (deskIndex1.length)) {
					midNumi = 0;
				}
			}
			
			//2열람실 좌석 배열 arr2
			for (int i = 0; i <deskIndex2.length; i++) {
				if(i == 0) {
					System.out.println("*2열람실*");
				}
				for (int j = 0; j <deskIndex2[i].length; j++) {
					deskIndex2[i][j] =firstBraket + "2"  + (String.valueOf(midNumi)) + (String.valueOf(midNumj++)) + lastBraket;
					System.out.print(deskIndex2[i][j]);
				}
				midNumj = 0;
				String.valueOf(midNumi++);
				System.out.println();
				
				if(midNumi == (deskIndex2.length)) {
					midNumi = 0;
				}
			}
			
			//3열람실 좌석 배열 arr3
			for (int i = 0; i <deskIndex3.length; i++) {
				if(i == 0) {
					System.out.println("*3열람실*");
				}
				for (int j = 0; j <deskIndex3[i].length; j++) {
					deskIndex3[i][j] =firstBraket + "3"  + (String.valueOf(midNumi)) + (String.valueOf(midNumj++)) + lastBraket;
					System.out.print(deskIndex3[i][j]);
				}
				midNumj = 0;
				String.valueOf(midNumi++);
				System.out.println();
				
				if(midNumi == (deskIndex3.length)) {
					midNumi = 0;
				}
			}
			  room.add(deskIndex1);
			  room.add(deskIndex2);
			  room.add(deskIndex3);

			/*
			for (int i = 0; i < arr3.length; i++) {
				for (int j = 0; j < arr3[i].length; j++) {
					System.out.print(arr3[i][j]);
				}
				System.out.println();
				midNumj = 0;
				String.valueOf(midNumi++);
				System.out.println();
			}	
			*/
	}

	public static void main(String[] args) {
		
		SeatSystem seatSystem = new SeatSystem();
		
		  seatSystem.seat();
		  System.out.println("Eventually done it damn!!"); 
	}
}