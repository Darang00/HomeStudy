package sec02.exam01; //파일 경로

public class ArrayCreateByValueListExample1 { // Name of class

	public static void main(String[] args) { // Declaring main() method for conducting this code
		
		int[] scores = {40, 70, 100, 69, 49, 96, 97}; // The value 'scores' refers the address of the array
		
		//호출 방법 1. 일일이 항목 지정 'variable' 가 주소값으로 참조하는 배열의 각 index에 있는 값' == variable[index];
		System.out.println(scores[0]);
		System.out.println(scores[1]);
		System.out.println(scores[2]);
		System.out.println(scores[3]);
		System.out.println(scores[4]);
		System.out.println(scores[5]);
		System.out.println(scores[6]);
		
		System.out.println(); // 줄 한칸 띄우기
		
		//호출 방법 2. for문 사용
		 for (int i = 0; i<7; i++) {
			 System.out.println(scores[i]);
		 }
		 
		 // Total count and Mean
		 int sum = 0; // sum이라는 지역변수 초기화
		 for (int i=0; i<7; i++) { // 초기조건_int 타입의 변수 i를 0으로 초기화; 조건문_i가 7보다 작다면 실행 ; 증감식_조건문 만족하면 {중괄호} 안의 내용 실시하고서 i를 1 증가시켜라
			 sum +=scores[i];
		 }
		 
		 System.out.println(); // 줄 한칸 띄우기
		 // Total count and Mean 출력
		 System.out.println("The sum is " +sum);
		 System.out.println("The average of the datas " + sum/scores.length); // scores.length == number of datas == maximum number of index + 1

	}

}
