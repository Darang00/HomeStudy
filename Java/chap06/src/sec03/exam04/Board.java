package sec03.exam04;

public class Board {
	//Field
	String title;
	String content;
	String writer;
	String date;
	int hitcount;
	
	
	//Constructor
	Board(String title, String content){
		this(title, content, "ID of the member signed in", "Current date in the computer", 0 );
	}
	
	Board(String title, String content, String writer){
		this(title, content, writer, "Current date in the computer", 0 );
	}
	
	Board(String title, String content, String writer, String date){
		this(title, content, writer, date, 0 );
	}
	
	Board(String title, String content, String writer, String date, int hitcount){
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.date = date;
		this.hitcount = hitcount;
		
	}
	


}
