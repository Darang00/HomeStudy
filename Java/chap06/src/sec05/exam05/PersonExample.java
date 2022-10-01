package sec05.exam05;

public class PersonExample {

	public static void main(String[] args) {
		Person p1 = new Person("123456-987654", "DayoengLho");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		//p1.nation="UK";
		//p1.ssn = "435678-123098";
		
		p1.name = "JisuKim";
	}

}
