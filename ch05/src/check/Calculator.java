package check;

public class Calculator {
	double x;
	double y;
	
	public double add() {
		return x + y;
	}
	public static void main(String[] args) {
		Calculator r1 = new Calculator();
		r1.x=3.4;
		r1.y=6.7;
		System.out.println(r1.add());

	}

}
