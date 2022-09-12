package study.team2.classExample;

public class Rectangle {
	//Field
	int x;
	int y;
	int width;
	int height;
	
	//Constructor
	Rectangle(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	//Method
	int square() {
		return width*height;
	}
	
	void show() {
		System.out.printf("At (%d, %d), the square has size of %d x %d %n", x, y, width, height);
	}
	
	boolean contain(Rectangle r) {
		if((r.x>= this.x) && (r.y>= this.y) && ((r.x + r.width)<=this.width) && ((r.y + r.height)<=this.height)) {	
		return true;} else {
			return false;
		}	
	}
	

	public static void main(String[] args) {
		Rectangle r = new Rectangle(2, 2, 8, 7);
		Rectangle s = new Rectangle(5, 5, 3, 6);
		Rectangle t = new Rectangle(1, 2, 10, 10);
		
		r.show();
		if(t.contain(r))System.out.println("t contains r");
		if(t.contain(s))System.out.println("t contains s");

	}

}
