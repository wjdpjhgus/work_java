package com.koitt.java.class04;
import obj.constructor.Car;

public class TestDrive {

	public static void main(String[] args) {
		//부가티 자동차 생성			
		Car boogati = new Car("부가티", 400);
		
		//주인 생성-홍길동 주인이 부가티라는 자동차를 소유한다.
		Owner gildong = new Owner("홍길동" ,boogati);
		//주인이 소유한 자동차를 소개하는 메소드를 호출
		gildong.introCar();
			
		// 소나타 자동차 생성
		Car sonata =new Car("소나타", 100);
		
		//주인생성- 현이라는 주인이 소나타라는 자동차를 소유한다
		Owner hyun = new Owner("현", sonata);
		//주인이 소유한 자동차를 소개하는 메소드를 호출
		hyun.introCar();
	}

}

