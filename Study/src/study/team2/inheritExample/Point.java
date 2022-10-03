package study.team2.inheritExample;

public class Point {
	//Field
	private int x, y;
	
	//Basic Constructor
	public Point() {
		
	}
	
	//Constructor
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//Method
	public int getX() {return x;}
	public int getY() {return y;}
	protected void move(int x, int y) {
		this.x = x;
		this.y = y;
	}

	void move() {
		// TODO Auto-generated method stub
		
	}
}
