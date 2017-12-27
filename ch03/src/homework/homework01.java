package homework;
	
import java.util.Scanner;
		
public class homework01 {
			
	public static void main(String[] args) {
		
				//문제1
		Scanner input = new Scanner(System.in);

		System.out.println("실수 두개를 입력하시오: ");

		double A = input.nextDouble(); double B =input.nextDouble();
		double ave = (A+B)/2;
				
		System.out.println(A);
		System.out.println(B);
		System.out.println("두 실수의 합은 " + ave + "이다");
				
		  
	}

}
