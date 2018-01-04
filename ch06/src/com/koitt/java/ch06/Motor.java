package com.koitt.java.ch06;
/*
 * 자바는 한개 클래스만 상속 받을 수 있다.
 */
public class Motor extends Vehicle {
	public String name ="자동차"; //이름 덮어씀 원래는 "차량"	
	public int displacement;	//배기량
	
	
	//setter
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed =maxSpeed;
		
	}
	public void setSeater(int seater) {
		this.seater =seater;
	}
	public void setDisplacement(int displacement) {
		this.displacement =displacement;
	}
	
	public void printLnfo() {
		System.out.print(super.name+": "+name);	
		System.out.println(", 최대속도: "+maxSpeed+"km");
		System.out.print("정원: "+seater+ "명");
		System.out.println(", 배기량: "+displacement+ "cc");
	}
	
	
	public static void main(String[] args) {
		Motor myCar =new Motor(); //객체 만듦
		//초기값 세팅
		myCar.setMaxSpeed(300);
		myCar.setSeater (2);
		myCar.setDisplacement(3500);
		//출력
		myCar.printLnfo(); 
	}
	

}
