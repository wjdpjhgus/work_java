package operator;

public class LogicalOP {

	public static void main(String[] args) {
		System.out.format("%5b && %5b | %b %n", true, true, true && true);
		System.out.format("%5b && %5b | %b %n", true, false, true && false);
		System.out.format("%5b && %5b | %b %n", false, true, false && true);//and 좌측이 트루면 우측안봄
		System.out.println();
		System.out.format("%5b || %5b | %b %n", true, false, true || false);//or 좌측이 트루면 우측안봄
		System.out.format("%5b || %5b | %b %n", false, true, false|| true);
		System.out.format("%5b || %5b | %b %n", false, false, false || false);
		System.out.println();
		System.out.format("!%5b | %b %n", true, !true);
		System.out.format("!%5b | %b %n", false, !false);
		
		
		

	}

}
