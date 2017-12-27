package programming.basic;

public class HelloProgramming {
	
	//인스턴스 변수(Instance Variable=필드=멤버 변수)선언-변수 선언하면 내용 변경시 일일히 바꿀 필요가 없다.
	static String fd = "--필드";
	static String md = "--메소드";
		
	//자바 프로그램을 실행하는 main() 메소드 구현
	public static void main(String[] args) {
		System.out.println("자바 클래스의 구조");
		write(fd);//밑에 word에 넣어서 한번에 작동시킬 수 있음 
		write(md);
		write("안녕하세요");
	}
	//프로그래머가 정의하는 메소드 write()의 구현
	public static void write(String word) {
		System.out.println(word);
		
	}
}
