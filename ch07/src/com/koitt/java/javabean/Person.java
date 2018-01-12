package com.koitt.java.javabean;

import java.io.Serializable;

//자바 빈 (Java bean)
public class Person extends Object implements Serializable {
	
	private String name;
	private int age;

	//1. 기본 생성자 만들기

	public Person() {

	}

	//2.생성자(필드전체를 초기화 하는 생성자)
	public Person(String name, int age) {
		this.name= name;
		this.age=age;
	}

	//3. getter, setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	//4.equals 구현
	@Override
	public boolean equals(Object obj) {
		//4-1 나 자신과 Argument의 객체 주소값 비교
		if (this ==obj) {
			return true;

		}

		//4-2 obj가 현재 클래스를 상속받고 있는지 확인
		if (!(obj instanceof Person)) {
			return false;
		}

		//4-3 name필드가 같다면 같은 객체로 결과를 리턴
		Person p =(Person) obj;
		if (this.name.equals(p.name)) {
			return true;
		}
		return false;
	}
	
	//5.hashCode 구현: 객체 하나를 하나의 숫자로 표현하는 메소드(가짜 주소값)
	@Override
	public int hashCode() {
		return this.name.hashCode()+this.age;//age는 hashcode가 없는 이유가 숫자 자체를 주소로 한다. 해커가 악용할 수 있으므로 숫자를 곱하거나 해서 복잡하게 함
		
	}
	
	//6. 객체의 내용을 문자열로 표현하는 메소드
	@Override
	public String toString() {
		//String a ="name = " + this.name+ ", age = " + this.age; 밑에와 같다.
		StringBuilder sb = new StringBuilder();
		sb.append("name=");
		sb.append(name);
		sb.append(", age = ");
		sb.append(this.age);
		String a = sb.toString();//지금까지 append한 문자를 String 타입으로 변환
		return a;
	}
	public static void main(String[] args) {
		Person p1 = new Person("철수", 35);
		Person p2 = new Person("영희",30);
		Person p3 = new Person("철수", 35);
		
		//1.equals 사용법
		if(p1.equals(p2) ) {					//객체에 . 찍어서 접근
			System.out.println("이사람은 같은 사람입니다");
		}
		else {
			System.out.println("이사람은 다른 사람입니다");
			
		}
		if(p1.equals(p3) ) {					//객체에 . 찍어서 접근
			System.out.println("이사람은 같은 사람입니다");
		}
		else {
			System.out.println("이사람은 다른 사람입니다");
			
		}
		
		Object o = new Object();
		System.out.println(o.hashCode());//나오는 숫자는 가짜 주소값
		Object o2 = new Object();
		System.out.println(o2.hashCode());
		
		//2.hashCode값을 출력
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		System.out.println(p3.hashCode());
		//3.toString 메소드 사용
		System.out.println((p1.toString()));
		System.out.println(p2);//println  메소드에서 자동으로 객체의 toString을 호출
		System.out.println(p2);
	
	}
}
