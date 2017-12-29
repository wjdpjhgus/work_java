package pratice;

public class homework01 {

	public static void main(String[] args) {
		//2단부터9단까지
		for (int i =2; i < 10; i++) {
			//곱하는 숫자 1~9 반복
			for (int j =1; j < 10; j++) {
				System.out.printf(" %d * %d = (%d)\t ", i ,j ,i*j);					
			}
			System.out.println();
		}
	}
}

