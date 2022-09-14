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
	void setXY(int x, int y) {
		move(x,y);
		
	}
	void setColour(String colour) {
		this.colour = colour;
		
	}
	
	@Override
	public String toString() {
		return colour+"색의 (" + getX() + ", " + getY() + ")의 점";
	}



	public static void main(String[] args) {
		ColourPoint cp = new ColourPoint(5, 5, "Yellow");
		cp.setXY(10, 20);
		cp.setColour("RED");
		String str = cp.toString();
		System.out.println(str + "입니다");
	
		

	}

}
