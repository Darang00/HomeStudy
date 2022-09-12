package study.team2.classExample;

public class TV {
	//Field
	String brand;
	int year;
	int size;
	
	//Constructor
	TV(String brand, int year, int size){
		this.brand = brand;
		this.year = year;
		this.size = size;
	}
	
	//Method
	void show() {
		System.out.printf("Made by %s, in %d, %d inch %n", brand, year, size);
	}
	
	
	public static void main(String[] args) {
		TV myTV = new TV("LG", 2017, 32); //LG에서 만든 2017년 32인치
		myTV.show();
		
	}

}
