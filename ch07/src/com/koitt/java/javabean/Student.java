package com.koitt.java.javabean;

public class Student {
	private int studentId; //학번
	private String name; 	//이름

	//기본생성자
	public Student() {

	}
	//모든 필드 초기화 생성자
	public Student(int studentId, String name) {
		super();
		this.studentId = studentId;
		this.name = name;
	}
	
//Getter Setter
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		//해커방지
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());//name 값이 null이면 0을 넣고 아니면 hashCode의 가짜 주소값을 넣어라
		result = prime * result + studentId;//int값은 숫자 자체가 주소값으로 활용한다.
		return result;//원래 저장은 10101010이런식이고 그 주소값ex5000 등이 있고 그주소값의 가짜주소값이 hashCode이다.
	}

	@Override
	public boolean equals(Object obj) {
		//4-1 나 자신과 Argument의 객체 주소값 비교
		if (this == obj) {
			return true;

		}

		//4-2 obj가 현재 클래스를 상속받고 있는지 확인
		if (!(obj instanceof Student)) {
			return false;
		}

		//4-3 studentId필드가 같다면 같은 객체로 결과를 리턴
		Student p =(Student) obj;
		if (this.studentId == p.studentId) {//int 자체가 주소값이라서 equals 말고 ==으로 비교하는것이 주소값을 비교하는것
			return true;					//equals가 불가능한 이유:int기본형이고 메소드가 없는데 hashCode는 메소드 이므로 
		}
		return false;
	}
	
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + "]";
	}
	
	/*@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [studentId=");
		builder.append(studentId);
		builder.append(", name=");
		builder.append(name);
		builder.append("]");
		return builder.toString();*/

	
	}

	


/*클래스 Student
private int studentId; //학번
private String name; 	//이름
자바 빈(Java bean) 클래스를 작성하시오

equals 비교대상은 studentId가 동일하면 같은 객체로 인식하도록 작성하시오.
main 메소드를 작성하고 각 오버라이딩한 메소드를 사용하는 코드를 작성하시오*/


