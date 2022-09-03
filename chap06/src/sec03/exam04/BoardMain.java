package sec03.exam04;

public class BoardMain {

	public static void main(String[] args) {
		Board board = new Board("SelfStudyJava", "StudyProgramming");
		System.out.println("The title is " + board.title);
		System.out.println("The content is " + board.content);
		System.out.println("The writer is " + board.writer);
		System.out.println("The date is " + board.date);
		System.out.println("The hitcount is " + board.hitcount);
		
	
	}

}
