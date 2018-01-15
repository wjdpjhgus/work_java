package exception;

public class ExceptionHandling {
	static int [] num;
	public static void main(String[] args) {
		String str []	= {"안녕하세요!", "Hello!"};

		try {
			System.out.println(str [0]);
			System.out.println(num.length);
			System.out.println(str [2]);
		} 
		catch (Exception e) {
			System.out.println("예외 발생: "+ e);
			// 다음과 같다. System.out.println("예외 발생: "+ e.toString());
			
			System.out.println("예외 발생 메세지: "+ e.getMessage());//메세지 세팅을 해줘야 나옮
			e.printStackTrace();
		}
		finally	{
			System.out.println("try 실행");
		}
		System.out.println("프로그램이 정상적으로 종료 됩니다.");

	}

}
