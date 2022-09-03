package sec03.exam02;

public class Korean { // This class is a public class
	
	//field
	String nation = "대한민국";
	String name ;
	String ssn ;
	
	//constructor
	public Korean(String name, String ssn) { // The "Korean" object is included in the public class so that this constructor is public one as well
		this.name = name;                           // the "n" and "s" are the parameters of this constructor
		this.ssn = ssn;
	}
	

}
