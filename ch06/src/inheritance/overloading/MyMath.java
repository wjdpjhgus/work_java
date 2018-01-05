package inheritance.overloading;

public class MyMath {
	double x, y;
	
	public MyMath(double x, double y) {
	this.x = x;
	this.y=y;
	}
	
	public double multiply() {
		return x*y;
	}
	public static double multiply(double a, double b) {
		return a*b;
		//return x*y; xy를 찾을 수가 없음 static만 메모리에 올라가 있음
		//return this.x*this.y 
	}
	
	public static void main(String[] args) {
	MyMath math = new MyMath(3.4, 6.7);
	System.out.println(math.multiply());
	System.out.println(math.multiply(3.4, 6.7));

	}

}
