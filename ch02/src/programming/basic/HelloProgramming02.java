package programming.basic;

public class HelloProgramming02 {
	//자바 메모리에 올리는 시점과 실행하는 시점이 다르다. 그래서Static사용해서 인식하게 한다.
	static String hello = "안녕하세요. 메인(전역)변수-static 필요";
	
	public static void main(String[] args) {
			String hello2 = "지역변수-지역에서만 사용가능 대신 static없어도 가능";
			System.out.println(hello);
			System.out.println(hello2);
			print9(hello2);
	}
	static void print9(String val) {
		System.out.println(val);
		System.out.println(val);
		System.out.println(val);
		System.out.println(val);
		System.out.println(val);
		System.out.println(val);
		System.out.println(val);
		System.out.println(val);
		
	}
}
