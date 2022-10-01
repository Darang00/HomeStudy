package sec02.exam04;

public class Bus extends Vehicle{
	@Override // 부모인 Vehicle 클래스의 run()함수 재정의
	public void run() {
		System.out.println("Running bus");
	}
}
