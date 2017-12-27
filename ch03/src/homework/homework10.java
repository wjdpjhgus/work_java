package homework;

import java.util.Scanner;

public class homework10 {
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);

		  System.out.println("입금할 금액을 입력하세요 (최소단위:1000원) :");
		  int Num;

		  Num =input.nextInt();

		  int a = Num / 50000;
		  int b = (Num % 50000) / 10000;
		  int c = (Num % 10000) / 5000;
		  int d = (Num % 5000)/ 1000;
		 
		  System.out.println("출금금액 "+Num+"원 은");
		  
		  if (a > 0 && Num >= 1000 && Num % 1000 == 0) {
		  System.out.print("오만원권 "+a+"개");
		  }
		  else if (a == 0) {
			  System.out.print("");
		  }
		  if (b > 0 && Num >= 1000 && Num % 1000 == 0) {
		  System.out.print("만원권 "+b+"개");
		  }
		  else if (b == 0) {
			  System.out.print("");
		  }
		  if (c > 0 && Num >= 1000 && Num % 1000 == 0) {
		  System.out.print("오천원권 "+c+"개");
		  }
		  else if (c == 0) {
			  System.out.print("");
		  }
		  if (d > 0 && Num >= 1000 && Num % 1000 == 0) {
		  System.out.print("천원권 "+d+"개");
		  }
		  else if (d == 0) {
			  System.out.print("");
		  }
		  if (Num < 1000 || Num % 1000 != 0 ) {
			  System.out.print("출금할 수 없습니다.");
			  }
		  else if (Num >= 1000 && Num % 1000 == 0) {
			  System.out.print(" 로 출금되었습니다.");
		  }
		 
	 }
}
