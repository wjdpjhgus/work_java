package inheritance.abstractinterface;

public class USBMemory extends Device implements Connectable {

	@Override
	public void connect() {
		System.out.println(name + ", usb 메모리 연결합니다.");
		
	}

	@Override
	public void print() {
		System.out.println("삼성 usb 메모리 입니다.");
		
	}
		

}
