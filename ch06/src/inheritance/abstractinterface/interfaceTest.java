package inheritance.abstractinterface;

public class interfaceTest {

	public static void main(String[] args) {
		Device pdev[] = {new HPPrinter(), new USBMemory()};
		
		pdev[0].print();
		pdev[1].print();
		
		((Connectable) pdev[0]).connect();//타입이 디바이스 인데 디바이스에는 커넥트가 없다.
		((Connectable) pdev[1]).connect();

	}

}
