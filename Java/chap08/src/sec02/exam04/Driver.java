package sec02.exam04;

import sec02.exam03.Bus;
import sec02.exam03.Vehicle;

public class Driver {
	public void drive(Vehicle vehicle) { //vehicle은 Bus의 객체이기도 함
		if(vehicle instanceof Bus) { //vehicle 매개 변수가 탐조하는 객체가 Bus인지 조사
			Bus bus = (Bus) vehicle; //Bus 객체일 경우 안전하게 casting
			bus.checkFare(); //Bus 타입으로 casting을 하는 이유 //bus의 checkFare() 메소드 가져다 쓰려고
		}
		vehicle.run();
	}
}
