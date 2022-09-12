package study.team2.classExample;

public class Song {
	//Field
	String title;
	String artist;
	int year;
	String country;
	
	//Constructor
	Song(){}
	Song(String title, String artist, int year, String country){
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
	}
	
	//Method
	void show() {
		System.out.printf("In %d, the song %s was sang by %s from %s %n", year, title, artist, country);
	}

	public static void main(String[] args) {
		Song song = new Song("Dancing Queen", "ABBA", 1978, "Sweden");
		song.show();

	}

}
