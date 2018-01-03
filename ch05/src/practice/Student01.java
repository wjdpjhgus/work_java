package practice;

public class Student01 {
	public String major;
	public	int number;

	public Student01 (String major, int number) {
		this.major = major;
		this.number = number;
	}
	public static void main(String[] args) {
		Student01 A = new Student01("경영학과", 201121621);
		System.out.println(A.major +A.number);

	}
}
