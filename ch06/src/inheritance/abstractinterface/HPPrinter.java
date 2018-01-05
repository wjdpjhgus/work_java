package inheritance.abstractinterface;

public class HPPrinter extends Device implements Connectable {

	@Override
	//클래스 디바이스의 추상 메소드 구현
	public void print() {
		System.out.println("HP 프린터입니다.");
		
	}
	public void connect() {
		System.out.println(Connectable.name + " ,HP 프린터를 연결합니다.");
	}
}
