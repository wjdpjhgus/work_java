package operator;

import java.util.Scanner;

public class RelationalOP {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("두 정수를 입력 >>");
		int x = input.nextInt();
		int y = input.nextInt();

		System.out.format("%d > %d -> %b %n", x, y, x>y);
		System.out.format("%d >= %d -> %b %n", x, y, x>=y);
		System.out.format("%d < %d -> %b %n", x, y, x<y);
		System.out.format("%d <= %d -> %b %n", x, y, x<=y);
		System.out.format("%d == %d -> %b %n", x, y, x==y);
		System.out.format("%d != %d -> %b %n", x, y, x!=y);
		
		input.close();
	}

}
