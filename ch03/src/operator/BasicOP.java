package operator;

public class BasicOP {
	
	public static void main(String[] args) {
		int day, remainder;
		day = remainder = 365;//�������� �������� ����
		int week = 365 / 7;
		
		System.out.format("1���� %d�����̸� %d���̴�.%n", day, week);
		
		//remainder = remainder % 7;
		System.out.println(remainder %= 7);
		
		System.out.println(remainder);
		System.out.println(day);
	}

}
