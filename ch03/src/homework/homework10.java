package homework;

import java.util.Scanner;

public class homework10 {
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);

		  System.out.println("�Ա��� �ݾ��� �Է��ϼ��� (�ּҴ���:1000��) :");
		  int Num;

		  Num =input.nextInt();

		  int a = Num / 50000;
		  int b = (Num % 50000) / 10000;
		  int c = (Num % 10000) / 5000;
		  int d = (Num % 5000)/ 1000;
		 
		  System.out.println("��ݱݾ� "+Num+"�� ��");
		  
		  if (a > 0 && Num >= 1000 && Num % 1000 == 0) {
		  System.out.print("�������� "+a+"��");
		  }
		  else if (a == 0) {
			  System.out.print("");
		  }
		  if (b > 0 && Num >= 1000 && Num % 1000 == 0) {
		  System.out.print("������ "+b+"��");
		  }
		  else if (b == 0) {
			  System.out.print("");
		  }
		  if (c > 0 && Num >= 1000 && Num % 1000 == 0) {
		  System.out.print("��õ���� "+c+"��");
		  }
		  else if (c == 0) {
			  System.out.print("");
		  }
		  if (d > 0 && Num >= 1000 && Num % 1000 == 0) {
		  System.out.print("õ���� "+d+"��");
		  }
		  else if (d == 0) {
			  System.out.print("");
		  }
		  if (Num < 1000 || Num % 1000 != 0 ) {
			  System.out.print("����� �� �����ϴ�.");
			  }
		  else if (Num >= 1000 && Num % 1000 == 0) {
			  System.out.print(" �� ��ݵǾ����ϴ�.");
		  }
		 
	 }
}
