package study.team2.inheritExample;

public interface Stack {
	int length();  //현재 스택에 저장된 개수 return
	int capacity();  //스택의 전체 저장 가능한 개수 return
	String pop();  //스택의 top에 실수 저장
	boolean push(String val);  //스택의 top에 저장된 실수 return
}
