package sec01.exam04;

public class Member {
	//field
	public String name;
	public int age;
	
	//constructor
	public Member(String name, int age) {
		this.name = name;
		this.age = age;		
	}
	
	//method
	@Override
	public boolean equals(Object obj) { //name 과 age 값이 같으면 true를 return
		if(obj instanceof Member) {
			Member member = (Member) obj;
			return member.name.equals(name) && (member.age ==age);
		}else {
			return false;
		}
	}
	
	@Override
	public int hashCode() { //name 과 age 값이 같으면 동일한 hashCode를 return
		return name.hashCode() + age; //String 의 hashCode 이용
	}	
}
