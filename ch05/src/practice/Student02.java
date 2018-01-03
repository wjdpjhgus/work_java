package practice;

public class Student02 {
	private String major;
	private int number;

	public String getMajor() {
		return major;
	}
	
	public int getNumber() {
		return number;
	}
	
	public void setMajor(String major) {
		this.major = major;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	public static void main(String[] args) {
		Student02 A = new Student02();
		
		A.setMajor("경영학과");
		A.setNumber(201121621);
		System.out.println(A.getMajor());
		System.out.println( A.getNumber());
	}
}