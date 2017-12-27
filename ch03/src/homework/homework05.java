package homework;

import java.util.Scanner;

public class homework05 {

	public static void main(String[] args) {
		  Scanner input = new Scanner(System.in);

		  System.out.println("기원연수를 입력하세요 : ");
		  int a;

		  a =input.nextInt();

		  double b =a % 4;
		  double c = b % 100;
		  double d = a % 400;

		  if (b == 0 ) {
		   System.out.println("윤년");

		  } 
		  else if(c == 0) {
		   System.out.println("평년");
		  }
		  else if(d == 0) {
		   System.out.println("윤년");
		  }
		  
		  else if(b > 0) {
		   System.out.println("윤년이나 평년이 아닙니다.");
		  }
		  else if(c > 0) {
			   System.out.println("윤년이나 평년이 아닙니다.");
		  }
		  else if(d > 0) {
			   System.out.println("윤년이나 평년이 아닙니다.");
		 }
	 }
}
