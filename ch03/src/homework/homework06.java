package homework;

import java.util.Scanner;

public class homework06 {

	public static void main(String[] args) {
			 Scanner input = new Scanner(System.in);

			  System.out.println("õ�������� ������ �Է��ϼ��� :");
			  int Num;

			  Num =input.nextInt();

			  int a = Num / 10000;
			  int b = (Num % 10000) / 1000;
			  int c = (Num % 1000) / 100;
			  int d = (Num % 100)/ 10;
			  int e = (Num % 10)/ 1;
			 
			  System.out.println(Num+"��(��)");
			  
			  if (a > 0) {
			  System.out.print(a+"��");
			  }
			  else if (a == 0) {
				  System.out.print("");
			  }
			  if (b > 0) {
			  System.out.print(b+"õ");
			  }
			  else if (b == 0) {
				  System.out.print("");
			  }
			  if (c > 0) {
			  System.out.print(c+"��");
			  }
			  else if (c == 0) {
				  System.out.print("");
			  }
			  if (d > 0) {
			  System.out.print(d+"��");
			  }
			  else if (d == 0) {
				  System.out.print("");
			  }
			  if (e >= 0) {
			  System.out.print(e+"�Դϴ�");
			  }
			 
		 }
	}