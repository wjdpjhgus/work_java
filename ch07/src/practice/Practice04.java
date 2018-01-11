package practice;

import java.util.Calendar;
import java.util.Scanner;

public class Practice04 {
	public static void main(String[] args) {
		Calendar cal =  Calendar.getInstance();


		Scanner input= new Scanner(System.in);


		System.out.println ("년도를 입력하시오");	
		int year= input.nextInt();
		
		System.out.println ("월을 입력하시오");
		int month= input.nextInt();

		System.out.println ("날짜를 입력하시오");
		int date= input.nextInt();

		cal.set(year, month-1, date);//월은 0부터시작
		System.out.println(cal.getTime());
		
		//요일을 숫자로 리턴 :1부터 일요일
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		switch (dayOfWeek) {
			case Calendar.SUNDAY:
				System.out.println("일요일 입니다.");
				break;
			case Calendar.MONDAY:
				System.out.println("월요일 입니다.");
				break;
			case Calendar.TUESDAY:
				System.out.println("화요일 입니다.");
				break;
			case Calendar.WEDNESDAY:
				System.out.println("수요일 입니다.");
				break;
			case Calendar.THURSDAY:
				System.out.println("목요일 입니다.");
				break;
			case Calendar.FRIDAY:
				System.out.println("금요일 입니다.");
				break;
			case Calendar.SATURDAY:
				System.out.println("토요일 입니다.");
				break;
		}
	}
}








/*//필드
	Integer year;
	Integer month;
	Integer date;
	//생성자
	//메소드

	public static void main(String[] args) {
		Calendar today =  Calendar.getInstance();


		Scanner input= new Scanner(System.in);

		System.out.println ("년 입력하시오");

		int a = today.get(Calendar.YEAR) = input.nextInt();



		System.out.println ("월 입력하시오");

		int b = Calendar.MONTH=input.nextInt();



		System.out.println ("일 입력하시오");

		int c = Calendar.DATE =input.nextInt();

		System.out.println(today.getTime());

		System.out.println("오늘은"+a+"년"+b+"월" +c+"일 일요일입니다");

		input.close();







	}
}*/
