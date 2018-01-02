package obj.constructor;

public class Student /*extends Object*/ {

	public String name;

	//생성자(constructor)
	//알트 시프트 에스
	/*public Student(String name) {
	 * //super (): 나의 부모의 기본생성자를 호출
		super(): //super는 나의 부모 Object, 없다면 컴파일러가 자동으로 추가
		super(): 항상자식클래스 생성자의 맨 앞줄에 위치한다.
		
		super();
		this.name = name;
		} 
	 */ 
	 

	public Student(String name) {
		//필드 name을 초기화하는 생성자
		this.name =name;

	}


	public void print() {
		System.out.println("학생이름: " +this.name);
	}


	public static void main(String[] args) {
		Student i = new Student("김민정");//생성자 호출
		System.out.println(i.name);
		i.print();

		//Object 객체 생성(기본생성자를 이용하여 생성)
		/*
		 * 해당 클래스의 생성자가 하나도 없다면
		 * 컴파일러가 자동으로 기본생성자를 생성한다.
		 */
		Object test =new Object();
		
		//이미 생성자 Student (String name)이 존재하기 때문에
		//컴파일러가 기본생성자를 생성하지않아서 아래와 같이 호출이 불가능하다.
		
		//Student s1 = new Student();
	}

}
