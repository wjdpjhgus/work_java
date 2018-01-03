package com.koitt.java.class04;

import obj.constructor.Car;

public class Owner {
	private String name; //주인이름
	private Car car; 	//주인이 소유한 자동차 이름
	
	
	public Owner (String name, Car car) {
		this.name=name;

		this.car = car;
	}
	
	//주인이 소유한 고양이 소개한 메소드 구현
		public void introCar() {
			System.out.println(this.name +"의 차는 ");
			System.out.println(car.getBrandName()+"이고, 최고속도는");
			System.out.println(car.getMaxSpeed()+"이다");
	}

}
