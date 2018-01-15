package com.tophoon.java.problem.exam06;

public class Rectangle extends Shape implements Printer {


	private double width;
	private double height;

	public Rectangle(double x, double y,double width, double height) {
		super(x, y);
		this.width= width;
		this.height=height;


	}

	@Override
	public void draw() {
		super.drawCenter();
		System.out.println("가로: "+width+","+"세로: "+height+"사각형 면적: "+width*height);

	}

	@Override
	public void printClassName() {
		System.out.println("Rectangle");
		
	}





}
/*- 

      부모클래스로부터 상속받은 추상메소드 구현: drawCenter() 메소드 호출 후, 가로와 세로, 사각형 면적 출력 / 출력예시: 가로: 3.67, 세로: 7.89*/