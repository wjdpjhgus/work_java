package com.koitt.class01.java.ch03;

import java.util.Scanner;

public class ch3 {

	public static void main(String[] args) {
		/*����1
		Scanner input =new Scanner(System.in);

		System.out.println("�Ǽ� �ΰ��� �Է��Ͻÿ�: ");

		 double A = input.nextDouble(); double B =input.nextDouble();

		 double ave = (A+B)/2;
		System.out.println(A);
		System.out.println(B);
		System.out.println("�� �Ǽ��� ���� " + ave + "�̴�");
		 */


		/*���� 3
        Scanner input =new Scanner(System.in);

		System.out.println("(kg)�� �Է��Ͻÿ�: ");
		double A;
		A = input.nextDouble(); 
		double po = (A/0.453592);
		System.out.println(A);
		System.out.printf("%1$.3f", po);
		 */

		/*����4
		 Scanner input =new Scanner(System.in);

			System.out.println("����/ȭ���� �µ��� �Է��Ͻÿ�: ");
			String a;
			double b;
			a =input.next(); b = input.nextDouble(); 

			double F =(9.0/5.0) * b + 32;
			double C =(5.0/9.0) * (b-32);

			switch(a) {
				case "C" :
				case "c" :
				System.out.println("ȭ�� C"+C);
				break;

				case "F" : 
				case "f" :
					System.out.println("���� C"+F);



			}
	}
}
		 */

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

	}
}


