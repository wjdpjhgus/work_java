package programming.basic;

public class HelloInput {
	
	public static void main(String[] args) {
		
		//System.in은 키보드의 입력스트림
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("이름과 학번과 학번을 입력하세요.");
		
		//입력받은 문자열을 토큰으로 구분지어서 문자열 일부를 리턴
		String name = input.next();//.은 메소드에 접근한다 호출한다.
		int num = input.nextInt();
		String major = input.next();
		System.out.println("이름: " + name + ", 학번: " + num + ", 학과: " + major);
	}

}