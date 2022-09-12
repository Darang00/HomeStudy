package study.team2.inheritExample;

public class ColourTV extends TV{
	int colour;

	public ColourTV(int size, int colour) {
		super(size);		
		this.colour = colour;
	}
	
	void printProperty() {
		System.out.printf("%d inch, %d colour", getSize(), colour);
	}
	
	
	public static void main(String[] args) {
		ColourTV myTV = new ColourTV(32, 1024);
		myTV.printProperty();
		
	}
}

