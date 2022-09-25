package sec01.exam08;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashTableExample {
	public static void main(String[] args) {
		Map<String, String> map = new Hashtable<String, String>();
		
		//ID와 PW를 미리 저장
		map.put("Spring", "345");
		map.put("Summer", "678");
		map.put("Autumn", "91011");
		map.put("Winter", "12123");
		
		Scanner scanner = new Scanner(System.in); //키보드로부터 입력되는 내용을 받기 위한 code
		
		while(true) {
			System.out.println("Please enter your ID and PW");
			System.out.print("ID >> ");
			String id = scanner.nextLine(); //키보드로 입력하는 id를 읽음
			
			System.out.print("PW >> ");
			String password = scanner.nextLine(); //키보드로 입력하는 pw를 읽음
			
			if(map.containsKey(id)) {
				if(map.get(id).equals(password)) {
					System.out.println("Successfully sign-in");
					break;
				} else {
					System.out.println("Unmachted password");
				}
			}else {
				System.out.println("Unexisted ID");
			}			
		}		
	}	
}
