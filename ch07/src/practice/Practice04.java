package practice;
import java.util.Calendar;
import java.util.Scanner;

public class Practice04 {
	public static void main(String[] args) {



		Scanner input= new Scanner(System.in);
		System.out.println ("년 입력하시오");

		Integer year =input.nextInt();

		
		
		System.out.println ("월 입력하시오");

		Integer month =input.nextInt();

	
		
		System.out.println ("일 입력하시오");

		Integer date =input.nextInt();

		System.out.println("오늘은"+year+"년"+month+"월" +date+"일 일요일입니다");
	}
}
