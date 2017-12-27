package control.switchcondtion;

import java.util.Scanner;

public class BasicSwitch {

	public static void main(String[] args) {
		double x, y;
		int op;
		Scanner input =new Scanner(System.in);
		System.out.println("두 실수 입력: ");
		x =input.nextDouble(); y =input.nextDouble();
		System.out.println("번호선택 1(+), 2(-), 3(*), 4(/): ");
		op = input.nextInt();
		
		switch (op) {
		case 1:
			System.out.printf("%.2f + %.2f = %.2f\n",x, y, x+y);
			break;//break없으면 안넘어가고 다실행됨
		case 2:
		System.out.printf("%.2f - %.2f = %.2f\n",x, y, x-y);
		break;
		case 3:
		System.out.printf("%.2f * %.2f = %.2f\n",x, y, x*y);
		break;
		case 4:
		System.out.printf("%.2f / %.2f = %.2f\n",x, y, x/y);
		break;
		default:
			System.err.println("연산자번호를 잘못 입력했습니다.\n");
		}
	}

}
