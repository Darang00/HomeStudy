package study.team2.inheritExample;

public class ColourPoint extends Point{
	//Field
	String colour;
	
	//Constructor
	public ColourPoint(int x, int y,String colour ) {
		super(x, y); //부모한테 물려받은 x, y
		this.colour = colour;
	}
	
	//Method
	void setXY() {
		
	}



	public static void main(String[] args) {
		ColourPoint cp = new ColourPoint();
		

	}

}
