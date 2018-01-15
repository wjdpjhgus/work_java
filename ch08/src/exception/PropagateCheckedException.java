package exception;

public class PropagateCheckedException {
	
	//메소드 선언에서 다시 예외ClassNotFoundException의 발생을 전달
	public static void main(String[] args) throws ClassNotFoundException {
		//메소드 "java.lang.Object()을 사용하려면 반드시 예외처리해야함
		Class<?> forName = Class.forName("java.lang.Objec");////컴파일 오류
		System.out.println(forName);

	}

}