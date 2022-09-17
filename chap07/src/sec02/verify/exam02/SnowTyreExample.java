package sec02.verify.exam02;

public class SnowTyreExample {
	public static void main(String[] args) {
		SnowTyre snowTyre = new SnowTyre();
		Tyre tyre = snowTyre; //다형성
		
		snowTyre.run();
		tyre.run(); 
	}
}
