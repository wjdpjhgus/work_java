package Practice;

import java.util.Scanner;

public class Student extends Person {
//필드
	public String school;
	public String major;
	public int idNumber;
	public double average;
	//생성자
	
	public Student(String name, int age, String address) {
		super(name, age, address);
	}
	
	
	public Student(String school, String major, int idNumber) {
	
		this.school=school;
		this.major=major;
		this.idNumber=idNumber;
		}
	
	public void printInfo () {
		System.out.println("학교 : "+this.school);
		System.out.println("학과 : "+this.major);
		System.out.println("학번: "+this.idNumber);
		System.out.println ("---------------------------");
	}
	
	public void average() {
		
		double r1, r2,r3,r4 ,r5,r6,r7,r8;
		
	Scanner input =new Scanner(System.in);
	System.out.println ("8학기 학점을 순서 대로 입력하세요");
	
	System.out.println ("1학기 학점 -> ");
	r1 =input.nextDouble();
	
	System.out.println ("2학기 학점 -> ");
	r2 =input.nextDouble();
	
	System.out.println ("3학기 학점 -> ");
	r3 =input.nextDouble();
	
	System.out.println ("4학기 학점 -> ");
	r4 =input.nextDouble();
	
	System.out.println ("5학기 학점 -> ");
	r5 =input.nextDouble();
	
	System.out.println ("6학기 학점 -> ");
	r6 =input.nextDouble();
	
	System.out.println ("7학기 학점 -> ");
	r7 =input.nextDouble();
	
	System.out.println ("8학기 학점 -> ");
	r8 =input.nextDouble();
	System.out.println ("---------------------------");
		this.average = (r1+r2+r3+r4 +r5+r6+r7+r8)/8;
		
		System.out.println ("8학기 총 평균 평점은 "+this.average+"점입니다.");	
		
		input.close();
		
	}
	
}
