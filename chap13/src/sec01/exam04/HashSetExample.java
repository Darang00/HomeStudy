package sec01.exam04;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("Dayeong");
		set.add("Incheon");
		set.add("National");
		set.add("University");
		set.add("Dayeong"); //Dayeong은 한 번만 저장 됨
		set.add("Engineer");
		
		int size = set.size();
		System.out.println("The total number of the object is " + size);
		
		Iterator<String> iterator = set.iterator(); //반복자 얻기
		while(iterator.hasNext()) { //객체 수 만큼 looping
			String element = iterator.next(); //1개의 객체를 가져옴
			System.out.println("\t" + element); // \t는 tab키(들여쓰기)
		}
		
		set.remove("Incheon"); // Incheon 객체 삭제
		set.remove("National"); // National 객체 삭제
		
		System.out.println("The total number of the object is " + set.size()); //저장된 객체 수 얻기
		
		iterator = set.iterator(); //반복자 얻기
		for(String element : set) {
			System.out.println("\t" + element);
		}
		
		set.clear(); //모든 객체를 제거하고 비움
		if(set.isEmpty()) { //set 이 비어있니?(boolean)
			System.out.println("The HashSet is empty");
		}
	}
}
