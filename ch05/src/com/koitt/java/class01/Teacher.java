package com.koitt.java.class01;

public class Teacher extends Person {
/*Animal과 Person의 필드값을 상속 받기 때문에
 *  중복으로 작성하지 않아도 된다.
 */
	
	private String subject; //담당과목
	private int	year; //강의 경력
	private String group; //소속
	
	//기본 생성자(Default Constructor)
	/*
	 * 만약 구현된 생성자가 없다면 컴파일러가 기본생성자를 자동으로 생성한다.
	 */
	public Teacher() {
		
	}
	//다양성(Polymorphsim)의 예
	//메소드 오버로딩 (Method overloading)
	//생성자 ( Constructor): 필드 subject만 초기화 하는 생성자
	public Teacher(String subject) {
		this.subject= subject;
	}
	
	//생성자(Constructor):필드 subject,year만 초기화하는 생성자
	public Teacher(String subject, int year) {
		this.subject = subject;
		this.year = year;
	}
	//생성자(Constructor) :필드 전체를 초기화하는 생성자
	public Teacher(String subject, int year, String group) {
		this.subject = subject;
		this.year = year;
		this.group = group;
	public String getSubject() {
		return this.subject;
	}

	public void setSubject(String subject) {
		this.subject =subject;
	}
	public int getYear() {
		return this.year;
	}

	public void setYear(int year) {
		this.year =year;	
}
	public String getGroup() {
		return this.group;
	}

	public void setGroup(String group) {
		this.group =group;
	}
	/*
	 * 다형성
	 * 메소드오버라이딩-상속관계가 성립
	 * 메소드 제정의
	 * 	 */
	@Override //오버라이딩 했다는 표시를 위한 애너테이션
	public void print () {
		System.out.println("주민등록번호" + this.getSsn()+"과목:" 
			+this.subject+"주소" +this.getAddress()+ "강의년수"+this.year );
	
	}
}
