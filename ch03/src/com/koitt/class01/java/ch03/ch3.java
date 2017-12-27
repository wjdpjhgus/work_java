package com.koitt.class01.java.ch03;

import java.util.Scanner;

public class ch3 {

	public static void main(String[] args) {
		/*문제1
		Scanner input =new Scanner(System.in);

		System.out.println("실수 두개를 입력하시오: ");

		 double A = input.nextDouble(); double B =input.nextDouble();

		 double ave = (A+B)/2;
		System.out.println(A);
		System.out.println(B);
		System.out.println("두 실수의 합은 " + ave + "이다");
		 */


		/*문제 3
        Scanner input =new Scanner(System.in);

		System.out.println("(kg)을 입력하시오: ");
		double A;
		A = input.nextDouble(); 
		double po = (A/0.453592);
		System.out.println(A);
		System.out.printf("%1$.3f", po);
		 */

		/*문제4
		 Scanner input =new Scanner(System.in);

			System.out.println("섭씨/화씨와 온도를 입력하시오: ");
			String a;
			double b;
			a =input.next(); b = input.nextDouble(); 

			double F =(9.0/5.0) * b + 32;
			double C =(5.0/9.0) * (b-32);

			switch(a) {
				case "C" :
				case "c" :
				System.out.println("화씨 C"+C);
				break;

				case "F" : 
				case "f" :
					System.out.println("섭씨 C"+F);



			}
	}
}
		 */

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

	}
}


