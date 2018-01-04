package com.koitt.java.class04;
import obj.constructor.Car;

public class TestDrive {

	public static void main(String[] args) {
		//부가티 자동차 생성			
		Car boogati = new Car("부가티", 400);
		
		//주인 생성-홍길동 주인이 부가티라는 자동차를 소유한다.
		Car[] cars = new Car[3];
		cars[0] =new Car("A3",1);
		cars[1] =new Car("A5",2);
		cars[2] =new Car("A7",3);
		Owner gildong = new Owner("홍길동" ,cars);
		
		//주인이 소유한 자동차를 소개하는 메소드를 호출
		gildong.introCar();
			
		// 소나타 자동차 생성
		Car sonata =new Car("소나타", 100);
		
		
		//주인생성- 현이라는 주인이 소나타라는 자동차를 소유한다
		Car[] cars2 = new Car[3];
		cars2[0] =new Car("A1",1);
		cars2[1] =new Car("A2",2);
		cars2[2] =new Car("A3",3);
		
		Owner hyun = new Owner("현", cars2);
		
		//주인이 소유한 자동차를 소개하는 메소드를 호출
		hyun.introCar();
		
		/*//1.차량 생성
		Car mini = new Car("미니", 200);
		//2.현 차주의 차량을 교체
		hyun.setCar(mini);
		//3.교체한차소개
		hyun.introCar();*/
		
		//4.차량 세대를 생성하세요
		
	
		//5.길동의 차량을 변경하세요
		gildong.setCar(cars);
		//6.변경한 차량을 소개하세요
		
	}

}

