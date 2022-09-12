package study.team2.inheritExample;

public class IPTV extends ColourTV{
	//Field
	String address;
	
	//Constructor
	IPTV(String address, int size, int colour){
		super(size, colour);
		this.address = address;
	}
	
	//Method
	void printProperty() {
		System.out.printf("My IPTV is address of %s, size of %d, colour of %d", address, getSize(), colour);
	}
	
	public static void main(String[] args) {
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048); //"192.1.1.2" 주소에 32인치 2048 컬러
		
		iptv.printProperty();
	}

}
