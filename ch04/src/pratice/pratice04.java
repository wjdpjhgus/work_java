package pratice;
/*
 * Math 클래스의 pow()메소드 사용법을 알아야 풀 수 있다.
 * 사용법Math.pow(밑수, 지수)
 */
public class pratice04 {

	public static void main(String[] args) {
		
		for (double x=5.0; x<10; x+=0.5) {
			double y = 4 * Math.pow(x, 3) + 5 * Math.pow(x, 2)+ x + 2;
			System.out.printf("x=%.1f, y+%.2f%n", x, y);
		}
	}

}
