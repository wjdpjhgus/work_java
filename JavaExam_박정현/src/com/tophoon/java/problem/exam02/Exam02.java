package com.tophoon.java.problem.exam02;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("키를 입력하시오");
		double cm= input.nextDouble();
		
		System.out.println("몸무게를를 입력하시오");
		double kg= input.nextDouble();
		
		if (kg <= (cm - 100) * 0.9) {
			System.out.println("정상");
		}
		else {
			System.out.println("비만");
		}

	}

}
/*1. 패키지(Package) com.tophoon.java.problem.exam02을 생성하시오.



2. 클래스(Class) Exam02를 생성하시오.

 

3. main 메소드(Method)를 작성하시오.

 

4. main 메소드 안에 조건연산자(삼항연산자)를 이용하여 아래 내용을 읽고 프로그램을 작성하시오.

- 표준 입력으로 키와 몸무게를 실수로 입력 받아 다음 식을 이용하여 정상인지, 비만인지 출력하는 프로그램을 작성하시오.

- (몸무게 <= (키 - 100) * 0.9)이면 정상, 아니면 비만
*/