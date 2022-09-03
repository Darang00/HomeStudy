package sec02.exam03;

public class MemberExample { // Conducting class

	public static void main(String[] args) {
		
		Member member = new Member();
		
		member.name = "DayeongLho";
		System.out.println("Member name is " + member.name);
		
		System.out.println("Member id is " + member.id);
		
		System.out.println("Member password is " + member.password);
		
		member.age = 23;
		System.out.println("Member age is " + member.age);
		

	}

}
