package sec01.exam07;

public class Student {
	//field
	public int sno;
	public String name;
	
	//constructor
	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}
	
	//method
	public boolean equals(Object obj) { //학번(sno)과 이름(name)이 같다면 true를 return
		if(obj instanceof Student) {
			Student student = (Student) obj;
			return(sno == student.sno) && (name.equals(student.name));
		} else {
			return false;
		}
		
	}
	
	public int hashCode() { //학번(sno)과 이름(name) 이 같다면 동일한 값을 return
		return sno + name.hashCode();
	}

}
