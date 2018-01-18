package practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Practice01 {




	public static void main(String[] args) {

		int x =0, y=0, z=0;
		Scanner input = new Scanner(System.in);
		
		try {
			System.out.println("정수 두 개 입력: ");
		
		x = input.nextInt();
		y = input.nextInt();
		z=x*y;
		System.out.printf("%d * %d = %d %n", x, y, z);
		input.close();
	
		
		} 
		catch (InputMismatchException e) {
			System.out.println(" 정수 두개를 입력하세요");
		}
}
		
	}


