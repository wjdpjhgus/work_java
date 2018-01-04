package com.koitt.java.class04;

import obj.constructor.Car;

public class Owner {
	private String name; //주인이름
	private Car[] car; 	//주인이 소유한 자동차 이름


	public Owner (String name, Car[] car) {
		this.name = name;
		this.car = car;
	}


	public Car[] getCar() {
		return car;
	}

	public void setCar(Car[] car) {
		this.car = car;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	//주인이 소유한 고양이 소개한 메소드 구현
	public void introCar() {
		System.out.println(this.name +"의 차는 ");
		
		for (int i = 0; i < car.length; i++) {
			System.out.println(car[i].getBrandName()+"이고, 최고속도는");
			System.out.println(car[i].getMaxSpeed()+"이다");
		}

		System.out.println("그래서 총" +car.length+"대 이다");
	}

}
