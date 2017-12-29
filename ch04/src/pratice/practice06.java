package pratice;

public class practice06 {

	public static void main(String[] args) {
		double C;
		double F;
	
		
		for(C=-60; C <=140; C +=20) {
			F=(9.0/5.0)*C+32;
			System.out.println("섭씨" + C + "도는 화씨로" + F +"도 이다");
		}
	}
}

/* 섭씨 온도가 -60부터 140까지 20씩 증가
 * for (int degree = -60; degree >= 140; degree += 20) {
 * double f = (9.0/5.0)*degree+32
 * System.out.printf("섭씨: %d, 화씨온도: %.2f%n", degree, f);
 * }
 * */
