package inheritance.overriding;

public class Person {
	public String name;	//이름
	public long number;	//주민번호
	
	public Person(String name, long number) {
		super();		//생략가능
		this.name= name;
		this.number= number;
	}
	
	//@Override //오류발생 override된게 아닐때 오류 발생
	public void printInfo() {
		System.out.println("Person이름: "+ name + " 주민번호: "+number);
	}
}
