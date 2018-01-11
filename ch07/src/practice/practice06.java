package practice;

import java.util.Calendar;
import java.util.Scanner;

public class practice06 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		//표준입력을 받아 원하는 년도의 달력을 출력하여라
		Scanner input = new Scanner(System.in);
		System.out.println("년도 입력");
		
		int yearInput = input.nextInt();
		System.out.println("월 입력");
		int monthInput = input.nextInt();
		cal.set(yearInput, monthInput-1, 1);
		
		int year =cal.get(Calendar.YEAR);
		int month =cal.get(Calendar.MONTH);

		//시작일
		Calendar start = Calendar.getInstance();
		//마지막날
		Calendar end =Calendar.getInstance();

		start.set(year, month, 1);	//현재월의 1일을 설정
		end.set(year, month+1, 1);	//다음달 1일을 설정(예 2월 1일)
		end.add(Calendar.DATE,-1);	//현재월의 마지막 날 설정(에 1월 31일)

		System.out.printf("    %d년 %d월 달력 %n",year, month + 1);
		System.out.println(" 일 월 화 수 목 금 토");

		//1일 전까지는 공백으로 출력
		int startDay = start.get(Calendar.DAY_OF_WEEK);//이번주의 몇번째 날인지 가져오기
		int endDate = end.get(Calendar.DATE);

		for(int i =1; i<startDay; i++) {
			System.out.printf("%3s", " ");//s는 string이고 3은 세칸 띄운다.
		}

		//1부터 마지막 날까지 달력에 출력하기
		int day =startDay;
		
		
		for( int i = 1; i<=endDate; i++, day++) {
			System.out.printf("%3d", i);
			if(day %7 == 0 ) {
				System.out.println();
			}
			
		}

	}
}

