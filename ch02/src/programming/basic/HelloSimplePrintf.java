package programming.basic;

public class HelloSimplePrintf {

	public static void main(String[] args) {
		byte age = 27;
		int weight = 70;
		double height = 175.8;
		
		/*%d:10진수
		 * %f:float값
		 * %s:String 값
		 * %c:char값
		 * escape sequence
		 */
		System.out.printf("나이: %d, 몸무게: %d, 키: %f, \n", age, weight, height);//어떻게 출력할건지 정하고 %0은 빈칸
		System.out.printf("%s: %c 형", "혈액형", 'O');//형식 ,다음은 빈칸(%0)에 들어갈 값

	}

}
