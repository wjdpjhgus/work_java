package control.switchcondtion;

import java.util.Scanner;

public class BreakSwitch {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("���� ��(month)�� �� ��: ");
		int month = input.nextInt();
		
		switch (month) {
			case 1:
				case 2:
					case 3:
			System.out.println("%d���� 1�б� �Դϴ�. \n, month");
			break;
		
			case 4: case 5: case 6:
			System.out.printf("%d���� 2�б� �Դϴ�.\n",month);
			
			case 7: case 8: case 9:
				System.out.printf("%d���� 3�б� �Դϴ�.\n",month);
				
			case 10: case 11: case 12:
				System.out.printf("%d���� 4�б� �Դϴ�.\n",month);
				
			default:
				System.out.printf("���� �߸� �Է��ϼ̽��ϴ�.\n");
			
		}

	}

}
