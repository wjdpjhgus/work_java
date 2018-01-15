package exception;

public class CheckedException {

	public static void main(String[] args) {
		//메소드 "java.lang.Object()을 사용하려면 반드시 예외처리해야함
		Class<?> forName = Class.forName("java.lang.Object");////컴파일 오류
		System.out.println(forName);

	}

}
