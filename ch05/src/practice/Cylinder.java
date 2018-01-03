package practice;

public class Cylinder {
	Circle circle;
	double height;

	public double getVolum() {
		double area = circle.getArea();
		double volume =area*this.height;
		return volume;

	}

	//방법 1: circle필드를 stter를 이용하여 초기화
	public void setCircle(Circle circle)	{
		this.circle = circle;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public static void main(String[] args) {
		//1.원을 만든다. (Circle클래스를 이용하여 객체를 생성한다.)
		Circle c1 = new Circle(2.8);
		//2Cylinder를 만든다(실린더 클래스를 이용하여 객체를 생성한다.
		Cylinder c2 = new Cylinder();
		c2.setCircle(c1); 	//c2 객체의 circle필드를 초기화
		c2.setHeight(5.6); 	//c2 객체의 height필드를 초기화
		
		System.out.println(c2.circle+" / "+c2.height);
		//3. 실린더의 부피를 구하는 메소드를 호출한뒤 리턴값을 result변수에 저장
		double result =c2.getVolum();
		System.out.println(result);
	}

}
