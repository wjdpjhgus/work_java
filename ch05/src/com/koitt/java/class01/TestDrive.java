package com.koitt.java.class01;

public class TestDrive {

	public static void main(String[] args) {
		// 강사 sanghoon생성-Teacher 클래스의 객체(Object)를 생성
		//Teacher()는 생성자 호출
		Teacher sanghoon =new Teacher();
		Teacher changmok = new Teacher("수학");
		Teacher gildong = new Teacher("국어",3);
		Teacher younghee =new Teacher("영어",10, "영희선생 어학원");
		
		
		//강사 상훈의 정보 입력
		sanghoon.setAddress ("상도동");
		sanghoon.setAge(32);
		sanghoon.setGender("남");
		sanghoon.setGroup("한국아이티 인재개발학원");
		sanghoon.setName("정상훈");
		sanghoon.setSsn("861201");
		sanghoon.setSubject("프로그래밍");
		sanghoon.setYear(1);
		
		//Person의 print() 메소드 호출
		sanghoon.print();
		sanghoon.print();//Teacher의 printTeacher 메소드 호출
		//학생 taehyun 생성-Student 클래스의 객체를 생성
		Student taehyun = new Student();

		//학생 taehyun 정보입력
		taehyun.setAddress("서울");
		taehyun.setAge(42);
		taehyun.setGender("남자");
		taehyun.setGrade(4);
		taehyun.setMajor("연기과");
		taehyun.setName("차태현");
		taehyun.setSsn ("760325");
		taehyun.setstudentId(10);

		//강사 sanghoon의 객체의 정보를 출력
		System.out.println("=== 강사 sanghoon 객체 정보 ===");
		System.out.println(sanghoon.getAddress());
		System.out.println(sanghoon.getGroup());
		System.out.println(sanghoon.getName());
		System.out.println(sanghoon.getName());
		//학생 taehyun 객체의 정보를 출력
		System.out.println("=== 학생 taehyun 객체 정보 ===");
		System.out.println(taehyun.getGrade());
		System.out.println(taehyun.getMajor());
		System.out.println(taehyun.getName());
		System.out.println(taehyun.getAge());

		//강사 sanghoon의 이름을 변경
		sanghoon.setName("홍길동");

		//학생 taehyun의 나이를 변경
		taehyun.setAge(29);


		//강사 sanghoon의 객체의 정보를 출력
		System.out.println("=== 강사 sanghoon 객체 정보 ===");
		System.out.println(sanghoon.getAddress());
		System.out.println(sanghoon.getGroup());
		System.out.println(sanghoon.getName());

		//학생 taehyun 객체의 정보를 출력
		System.out.println("=== 학생 taehyun 객체 정보 ===");
		System.out.println(taehyun.getGrade());
		System.out.println(taehyun.getMajor());
		System.out.println(taehyun.getName());
		System.out.println(taehyun.getAge());
	}
	
		//(default)접근제한자로 변경시 발생하는 문제
		sanghoon.setSsn = "801201";
		System.out.println("주민등록번호 날조:" + sanghoon.getSsn);

	

}
