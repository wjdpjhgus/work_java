package control.switchcondtion;

import java.util.Scanner;

public class BreakSwitch {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("녀의 월(month)을 입 려: ");
		int month = input.nextInt();
		
		switch (month) {
			case 1:
				case 2:
					case 3:
			System.out.println("%d월은 1분기 입니다. \n, month");
			break;
		
			case 4: case 5: case 6:
			System.out.printf("%d월은 2분기 입니다.\n",month);
			
			case 7: case 8: case 9:
				System.out.printf("%d월은 3분기 입니다.\n",month);
				
			case 10: case 11: case 12:
				System.out.printf("%d월은 4분기 입니다.\n",month);
				
			default:
				System.out.printf("월을 잘못 입력하셨습니다.\n");
			
		}

	}

}
