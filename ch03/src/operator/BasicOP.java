package operator;

public class BasicOP {
	
	public static void main(String[] args) {
		int day, remainder;
		day = remainder = 365;//우측에서 좌측으로 볼것
		int week = 365 / 7;
		
		System.out.format("1년은 %d일이이며 %d주이다.%n", day, week);
		
		//remainder = remainder % 7;
		System.out.println(remainder %= 7);
		
		System.out.println(remainder);
		System.out.println(day);
	}

}
