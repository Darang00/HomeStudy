package sec01.exam01;

public class DmbCellPhoneExample {
	public static void main(String[] args) {
		//Creating object DmbCellPhone
		DmbCellPhone dmbCellPhone = new DmbCellPhone("iPhone", "pink", 23);
		
		//Field extended from CellPhone
		System.out.println("Model: " + dmbCellPhone.model);
		System.out.println("Colour: " + dmbCellPhone.colour);
		
		//Field of DmbCellPhone
		System.out.println("Channel: " + dmbCellPhone.channel);
		
		//Calling the method extended from CellPhone class
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("Hello");
		dmbCellPhone.receiveVoice("Hello, this is Dayeong");
		dmbCellPhone.sendVoice("Oh, yes. Nice to see you");
		dmbCellPhone.hangUp();
		
		//Calling the method of DmbCellPhone
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
	}
}
