package practice;

public class check5 {
static int num[];

public static void main(String[] args) {
	String str[] = {"안녕하세요", "Hello"};
	
	try {
		System.out.println(str[0]);
		System.out.println(num.length);
		System.out.println(str[2]);
		
	}catch (Exception e) {
		System.out.println("예외발생: "+ e);
	}finally {
		System.out.println("try실행");
	}
}
}
