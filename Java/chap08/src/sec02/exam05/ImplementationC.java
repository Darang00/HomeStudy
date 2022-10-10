package sec02.exam05;

public class ImplementationC implements InterfaceC{ //반드시 InterfaceA, InterfaceB, InterfaceC의 메소드 *Override* 해야함
	@Override
	public void methodA() {
		System.out.println("Running ImplementationC-methodA()");		
	}

	@Override
	public void methodB() {
		System.out.println("Running ImplementationC-methodB()");		
	}

	@Override
	public void methodC() {
		System.out.println("Running ImplementationC-methodC()");		
	}	
}
