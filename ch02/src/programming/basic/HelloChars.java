package programming.basic;

public class HelloChars {

	public static void main(String[] args) {
		System.out.println('a');		//char 형
		System.out.println('\\');		// \출력
		System.out.println('\142');		////8진수 142(=98)의 ASKII 코드값
		System.out.println('\uAC00');	//UTF-8(unicode) 값 AC00:가
		System.out.println('\uAC01');	//unicode 값 AC01:각
		System.out.println('강');

		System.out.println("hello\nworld\tHi\b\rABC\r\n");// \n은 엔터 \t는 탭 \b는 백스페이스 	\n과\t정도는 알아두기
			System.out.println("\'");

	}

}
