package sec01.exam07;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<Student, Integer>();
		
		//학번과 이름이 동일한 Student를 key로 저장
		map.put(new Student(1, "Dayeong"), 95);
		map.put(new Student(1, "Dayeong"), 95); 
		
		System.out.println("The total Entry number is " + map.size()); //저장된 총 Map.Entry 수 얻기
	}

}
