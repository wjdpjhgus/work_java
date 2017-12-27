package homework;

import java.util.Scanner;

public class homework08 {

	public static void main(String[] args) {
		
		 Scanner input =new Scanner(System.in);

			  System.out.println("세가지 정수를 입력하시오 :");
			   
			  int a;
			  int b;
			  int c;
			   
			  a = input.nextInt(); b = input.nextInt(); c = input.nextInt(); 
			   
			  int firstcompare;
			  firstcompare = a >= b ? a : b;		   
			   
			  int lastcompare;
			  lastcompare = firstcompare >= c ? firstcompare : c;
			   
			  System.out.println(lastcompare);
	}

}