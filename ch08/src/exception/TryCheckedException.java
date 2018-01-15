package exception;

public class TryCheckedException {

	public static void main(String[] args) {
		//메소드 "java.lang.Object()을 사용하려면 반드시 예외처리해야함
		Class<?> forName=null;
		try {
			forName = Class.forName("java.lang.Object");////컴파일 오류
		} 
		catch (ClassNotFoundException e) {
			/*
			 * 자동완성의 폐해
			 * .printStackTrace();는 예외에 대한 상세한 정보를 콘솔에 출력하기 때문에,
			 * 프로그램 배포시에는 꼭 막아야한다.
			 * (Debug용으로만 제발!!! 사용바랍니다.)
			 * */
			e.printStackTrace();
		}
		System.out.println(forName.toString());

	}

}
