package sec01.exam01;

public class CellPhone {
	//Field
	String model;
	String colour;
	
	//Constructor
	
	//Method
	void powerOn() {System.out.println("Turnning on the power");}
	void powerOff() {System.out.println("Turnning off the power");}
	void bell() {System.out.println("Ringing the bell");}
	void sendVoice(String message) {System.out.println("Me: " + message);}
	void receiveVoice(String message) {System.out.println("Other: " + message);}
	void hangUp() {System.out.println("Hanging up the call");}	
}
