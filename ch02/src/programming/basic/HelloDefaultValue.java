package programming.basic;

public class HelloDefaultValue {

	//필드선언-멤버변수에 해당하는 값은 자동으로 초기화됨
	static int def;
	static boolean bool;
	static String name;
	
	public static void main(String[] args) {
		//지역변수 선언
		int n = 100;
		System.out.println(n);
		
		//필드 사용 가능
		System.out.println(def);
		System.out.println(bool);
		System.out.println(name);
	}

}
