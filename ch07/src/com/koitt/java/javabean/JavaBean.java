package com.koitt.java.javabean;

public class JavaBean {

	public static void main(String[] args) {
		Student a= new Student();
		a.setStudentId(1111);
		a.setName("박정현");
		Student b = new Student(2222, "홍길동");
		Student c = new Student(1111, "철수");

		//hashcode
		System.out.println("hashCode사용 비교1");
		
		System.out.println(a.hashCode()+"!="+b.hashCode()+"a와b의 hashCode가 같지 않으므로 다르다.");
		System.out.println();
		
		System.out.println("hashCode사용 비교2");
		
		if ( a.hashCode()==b.hashCode()) {
			System.out.println(a.getName()+"과 " +b.getName()+"은 같은 사람입니다.");
		}
		else {
			System.out.println(a.getName()+"과 " +b.getName()+"은 다른 사람입니다.");
		}
		System.out.println();
		
		if ( b.hashCode()==c.hashCode()) {
			System.out.println(b.getName()+"과 " +c.getName()+"은 같은 사람입니다.");
		}
		else {
			System.out.println(b.getName()+"과 " +c.getName()+"은 다른 사람입니다.");
		}
		System.out.println();
		
		if ( a.hashCode()==c.hashCode()) {
			System.out.println(a.getName()+"과 " +c.getName()+"은 같은 사람입니다.");
		}
		else {
			System.out.println(a.getName()+"과 " +c.getName()+"은 다른 사람입니다.");
		}
		System.out.println();

		//equals
		System.out.println("equals사용 비교");
		if ( a.equals(b)) {
			System.out.println(a.getName()+"과 " +b.getName()+"은 같은 사람입니다.");
		}
		else {
			System.out.println(a.getName()+"과 " +b.getName()+"은 다른 사람입니다.");
		}
		System.out.println();
		
		if ( b.equals(c)) {
			System.out.println(b.getName()+"과 " +c.getName()+"은 같은 사람입니다.");
		}
		else {
			System.out.println(b.getName()+"과 " +c.getName()+"은 다른 사람입니다.");
		}
		System.out.println();
		
		if ( a.equals(c)) {
			System.out.println(a.getName()+"과 " +c.getName()+"은 같은 사람입니다.");
		}
		else {
			System.out.println(a.getName()+"과 " +c.getName()+"은 다른 사람입니다.");
		}
		System.out.println();

		//toString
		System.out.println("toString사용");
		System.out.println(a.toString());
		System.out.println();
		System.out.println(b.toString());
		System.out.println();
		System.out.println(c.toString());
		System.out.println();
	}
}
