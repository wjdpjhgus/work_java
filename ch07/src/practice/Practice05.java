package practice;

import java.util.Calendar;

public class Practice05 {
	
	public static void main(String[] args) {
		Calendar cal =  Calendar.getInstance();
		
		//달에서 요일의 횟수 반환
		int dayOfWeekInMonth = cal.get(Calendar.DAY_OF_WEEK_IN_MONTH);
		
		//몇번째 주인지 반환
		int WeekOfMonth = cal.get(Calendar.WEEK_OF_MONTH);
		
		//해의 날짜를 반환
		int DayOfYear = cal.get(Calendar.DAY_OF_YEAR);
		//해의 주 쵯수를 반한
		int WeekOfYear = cal.get(Calendar.WEEK_OF_YEAR);
		//주의 요일을 반환
		int DayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		
		System.out.println(cal.getTime());
	}
	public static String getDayOfWeek(int DayOfWeek) {
		
	}

}
