/*package practice;

public class Person {
	//필드 구성
	String name;

	//생성자
	public Person(String name) {
		this.name= name;
	}

	public boolean equals(Person a) {
		if(this.name==a.name) {
			return true;
		}
		return false;


	}
	public static void main(String[] args) {
		Person p1 = new Person("홍길동");
		System.out.println(p1.equals(new Person("홍길동")));
		System.out.println(p1.equals(new Person("최명태")));
	}



}*/


//강사님 풀이
package practice;

public class Person {
	//필드 구성
	String name;

	public Person(String name) {
		super();
		this.name = name;
	}

	public boolean equals(Object obj) {
		//1. argument의 객체와 나자신의 주소값을 비교
		if(this == obj) {
			return true;
		}

		//2 아규먼트의 객체가 이클래스를 상속받고 있는지 검사


		/*if(obj instanceof Person) {

			return true;//실제 이름을 name 비교하기 전에 끝남
		 }
		 */		
		if(!(obj instanceof Person)) {
			return false;
		}
		Person p = (Person) obj; //obj의 name필드에 접근하기 위해 다운캐스팅
		if(this.name.equals(p.name)) {//실제 name필드 값끼리 비교
			return true;
		}
		return false; //블리언 기본값이 펄스이기 때문에 기본리턴값은 펄스로 한다.
	}

	public static void main(String[] args) {
		Person p1 = new Person("홍길동");
		System.out.println(p1.equals(new Person("홍길동")));
		System.out.println(p1.equals(new Person("최명태")));
	}











}
}