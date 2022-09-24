package sec02.exam06;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {
		//Map Collection 생성
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		//객체 저장
		map.put("Dayeong", 100);
		map.put("Jisu", 95);
		map.put("Hyeju", 98);
		map.put("Dayoeng", 90); //"Dayeong" 키가 같기 때문에 제일 마지막에 저장한 값으로 대체
		System.out.println("The total Entry number is " + map.size()); //저장된 총 Entry 수 얻기		
		
		//객체 찾기
		System.out.println("\tDayeong: " + map.get("Dayoeng")); //이름(key)로 점수(value) 검색
		System.out.println();
		
		//객체를 하나씩 처리
		Set<String> keySet = map.keySet(); //Key Set 얻기
		//반복해서 key를 얻고 value를 Map에서 얻어냄
		Iterator<String> keyIterator = keySet.iterator(); 
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();
		
		//객체 삭제
		map.remove("Dayoeng"); //key로 Map.Entry 를 제거
		System.out.println("The total Entry number is " + map.size());
		
		//객체를 하나씩 처리
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet(); //Map.Entry Set 얻기
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		while(entryIterator.hasNext()) {
			//반복해서 Map.Entry를 얻고 key와 value를 얻어냄
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();
		
		//객체 전체 삭제
		map.clear(); //모든 Map.Entry 삭제
		System.out.println("The total Entry number is " + map.size());
	}

}
