package homework;

import java.util.Scanner;

public class homework02 {
	
	public static void main(String[] args) {

		//문제2
		Scanner input = new Scanner(System.in);

		System.out.println("정수 두개를 입력하시오: ");

		int A = (int)input.nextDouble(); int B =(int)input.nextDouble();
		
		double sum = A+B;
		double ave = sum/2;
		
		System.out.println(A);
		System.out.println(B);
		System.out.println("두 정수의 합은 " +sum+"평균은"+ ave + "이다");
		
	}

}