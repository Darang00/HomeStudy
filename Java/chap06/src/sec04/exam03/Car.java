package sec04.exam03;

public class Car {
	//Field
	int gas;
	
	//Constructor
	
	//Method
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if(gas==0) {
			System.out.println("There is no gas");
			return false;
		}
		System.out.println("There is some gas");
		return true; 
	}
	
	void run() {
		while(true) {
			if(gas>0) {
				System.out.println("Running (left gas : " + gas + ")");
				gas -= 1;
			}else {
				System.out.println("Stopping (left gas : " + gas + ")");
				return;
			}	
			/*for(int gas = this.gas; gas>0; gas -=1) {
			System.out.println("Running (left gas : " + gas + ")");
			
			} 
			System.out.println("Stoppig (left gas : " + gas + ")");
			return; //End of the conducting method */
			
		}
	}
}
