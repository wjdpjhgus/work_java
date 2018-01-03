package obj.field;

public class Circle {
	public double radius;
	public static final double PI = 3.141592;
	//생성자구현
	public Circle(double radius) {
		this.radius = radius;
	}

	//현재 반지름을 사용하여 원의 면적을 구하는 메소드
	public double getArea() {
		return this.radius*radius*PI;
		//return this.radius*radius*Circle.PI; //ok
		//return this.radius*radius*this.PI;//오류발생
	}
	//현재 반지를을 사용하여 원의 둘레 길이를 구하는 메소드
	public double getCircumference() {
		return 2*PI*radius;
	}
	//주요정보출력
	public void print() {
		System.out.printf("반지름이 %f 인 원의 면적은 %f이다. %n", radius, getArea());
		System.out.printf("둘레길이는 %.2f이다. %n", getCircumference());
	}


	public static void main(String[] args) {
		System.out.println("원주율: "+ Circle.PI);

		Circle c1 =new Circle(2.78);
		c1.print();
		Circle c2 = new Circle(5.25);
		c2.print();
	}

}
