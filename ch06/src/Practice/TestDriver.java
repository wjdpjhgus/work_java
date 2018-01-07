package Practice;



public class TestDriver extends Student {
	
	
	public TestDriver(String name, int age, String address) {
		super(name, age, address);
	}
	
	public TestDriver(String school, String major, int idNumber) {
		super(school, major, idNumber);
		
	}

	public static void main(String[] args) {

		Person a[] = {new Person("김다정", 20, "서울시관악구"),new Student("동양서울대학교", "전산정보학과", 20132222)};
		a[0].printInfo();
		a[1].printInfo();
		((Student) a[1]).average();
	
	}

}