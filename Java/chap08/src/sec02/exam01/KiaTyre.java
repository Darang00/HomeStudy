package sec02.exam01;

public class KiaTyre implements Tyre{ //Tyre interface를 구현하는 KiaTyre class

	@Override
	public void roll() { //Tyre interface의 method인 roll을 *반드시* 재정의 >> 구현
		System.out.println("Kia Tyre is rolling");		
	}
}
