package com.tophoon.java.problem.exam03;

public class Employee {
	//필드 default는 생략가능
	int number;
	String name;
	String dep;
	String rank;

	//생성자
	public Employee() {
	}
	public Employee(int number, String name, String dep, String rank ) {
		this.number=number;
		this.name =name;
		this.dep= dep;
		this.rank=rank;
	}

	public void printInfo() {
		System.out.println("사원번호: "+number);
		System.out.println();
		System.out.println("이름: "+name);
		System.out.println();
		System.out.println("부서명: "+dep);
		System.out.println();
		System.out.println("직급: "+rank);
		System.out.println();


	}

}


/*4. Employee 클래스를 아래와 같이 생성하시오.

필드 (Field): int 사원번호, String 이름, String 부서명, String 직급 (필드의 접근지정자는 모두 default 사용)

생성자 (Constructor): 기본생성자, 필드 전체를 초기화하는 생성자 2개 작성

메소드 (Method): 필드 전체를 출력하는 printInfo() 작성
 */