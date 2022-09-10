package sec01.exam01;

public class DmbCellPhone extends CellPhone {
	//Field
	int channel;
	
	//Constructor
	DmbCellPhone(String model, String colour, int channel){
		this.model = model;
		this.colour = colour;
		this.channel = channel;
	}
	
	//Method
	void turnOnDmb() {
		System.out.printf("Channel %d is starting receiving DMB broadcast %n" , channel);
	}
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.printf("Changing to channel %d", channel);
	}
	void turnOffDmb() {
		System.out.println("Stopping recieving DMB broadcast");
	}
}
