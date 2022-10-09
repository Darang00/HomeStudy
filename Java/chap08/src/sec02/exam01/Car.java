package sec02.exam01;

public class Car { //Declaring field of interface type and substituting initial implement object
	 Tyre frontLeftTyre = new HyundaiTyre();
	 Tyre frontRightTyre = new HyundaiTyre();
	 Tyre backLeftTyre = new HyundaiTyre();
	 Tyre backRightTyre = new HyundaiTyre();
	 
	 public void run() { //Calling 'roll()' method explained in interface
		 frontLeftTyre.roll();
		 frontRightTyre.roll();
		 frontLeftTyre.roll();
		 frontRightTyre.roll();
	 }
}
