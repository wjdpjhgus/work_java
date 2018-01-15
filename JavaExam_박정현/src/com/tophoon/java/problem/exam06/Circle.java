package com.tophoon.java.problem.exam06;

public class Circle extends Shape implements Printer{
private double radius;
	
		
 public Circle(double x, double y, double radius) {
	super(x, y);
	this.radius = radius;
}

@Override
public void draw() {
	super.drawCenter();
	System.out.println("반지름: " + radius+", "+"원면적: "+Math.PI*radius*radius);
	
}

@Override
public void printClassName() {
	System.out.println("Circle");
	
}

}


/*- 상속: Shape 추상클래스

- 필드:

      double radius (반지름, 접근지정자는 가장 제한적인 지정자를 사용하시오. 필요하다면 getter, setter 만들기.)

- 생성자:

      부모클래스의 필드 포함 모든 필드를 초기화하는 생성자 1개 작성

- 메소드:

      부모클래스로부터 상속받은 추상메소드 구현: drawCenter() 메소드 호출 후, 반지름과 원 면적 출력 / 출력예시: 반지름: 4.82, 원 면적: 72.98*/