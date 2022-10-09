package sec02.exam01;

public class HyundaiTyre implements Tyre{ //Tyre interface를 구현하는 HyundaiTyre class

	@Override
	public void roll() { //Tyre interface의 method인 roll을 *반드시* 재정의 해야한다 (interface의 메소드는 타입만 정해져 있고 실행구간이 비어있기 때문에!)
		System.out.println("Hyundai Tyre is rolling");
	}
}
