package com.tophoon.java.problem.exam04;

public class Exam04 {

	public static void main(String[] args) {
		Person park = new Person();
		park.setName("박정현");
		park.setAge(27);

		System.out.println("이름: "+ park.getName());
		System.out.println();
		System.out.println("나이: "+park.getAge());


	}

}

/*아래와 같이 Person 클래스를 생성하고 1번과 같은 언어 특성을 가지는 메소드 getter, setter를 작성하시오.

- 필드: String name, int age (접근지정자는 1번의 특성에 맞는 접근지정자를 사용할 것)



6. main 메소드에 Person 객체를 생성하고 setter를 이용해 자신의 이름과 나이를 입력하고,

getter를 이용해 이름과 나이를 출력하시오.



출력예시)

이름: 홍길동

나이: 20*/