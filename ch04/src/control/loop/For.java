package control.loop;

public class For {

	public static void main(String[] args) {
		int i =1; //선언한 위치가 중요하다 for안에서 선언하면 바디 안에서만 사용가능하다.
		for (i = 1; i <= 10; i++)
			System.out.print(i + " ");
		System.out.println();
		
		int sum = 0;
		for(i=1, sum = 0; i <= 10; i++ ); //11가지 돈다.
				System.out.printf("합: %d%n",sum);
				
				for (int j =1, total = 0; j <= 5; j++) {
					System.out.printf("1에서  %d까지의 합은 %d입니다.%n", j, total);
				}

	}

}
