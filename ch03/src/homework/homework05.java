package homework;

import java.util.Scanner;

public class homework05 {

	public static void main(String[] args) {
		  Scanner input = new Scanner(System.in);

		  System.out.println("��������� �Է��ϼ��� : ");
		  int a;

		  a =input.nextInt();

		  double b =a % 4;
		  double c = b % 100;
		  double d = a % 400;

		  if (b == 0 ) {
		   System.out.println("����");

		  } 
		  else if(c == 0) {
		   System.out.println("���");
		  }
		  else if(d == 0) {
		   System.out.println("����");
		  }
		  
		  else if(b > 0) {
		   System.out.println("�����̳� ����� �ƴմϴ�.");
		  }
		  else if(c > 0) {
			   System.out.println("�����̳� ����� �ƴմϴ�.");
		  }
		  else if(d > 0) {
			   System.out.println("�����̳� ����� �ƴմϴ�.");
		 }
	 }
}
