package study.team2.inheritExample;

public class ColourPoint2 extends Point{
	//Field
	String colour;
	
	//Constructor
	public ColourPoint2() { // (0, 0) 위치의 BLACK색 점
		super(0, 0);
		this.colour = "BLACK";		
	}
	
	public ColourPoint2(int x, int y) {
		super(x, y);
	}
	
	//Method
	void setXY(int x, int y) {
		move(x, y);
	}
	
	void setColour(String colour) {
		this.colour = colour;
	}
	
	@Override
	public String toString() {
		return colour + "색의 (" + getX() + ", " + getY() + ")의 점";
	}

	public static void main(String[] args) {
		ColourPoint2 zeroPoint = new ColourPoint2(); // (0, 0) 위치의 BLACK색 점
		System.out.println(zeroPoint.toString() + "입니다.");
		
		ColourPoint2 cp = new ColourPoint2(10,10); //(10, 10) 위치의 BLACK 색 점
		cp.setXY(5, 5);
		cp.setColour("RED");
		System.out.println(cp.toString() + "입니다");
	}
}
