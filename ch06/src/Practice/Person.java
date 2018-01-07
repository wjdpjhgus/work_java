package Practice;

public class Person {
//필드
	public String name;
	public int age;
	public String address;
	
	//생성자
	public Person() {
		
	}

	public Person (String name, int age, String address) {
		this.name=name;
		this.age=age;
		this.address=address;
	}
	public void printInfo () {
		System.out.println("이름 : "+this.name);
		System.out.println("나이 : "+this.age);
		System.out.println("주소: "+this.address);
	}
	
	
}
