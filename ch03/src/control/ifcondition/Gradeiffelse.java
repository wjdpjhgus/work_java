package control.ifcondition;

import java.util.Scanner;

public class Gradeiffelse {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		System.out.println("�����Է�: ");
		int point = input.nextInt();	//���� �Է¹ޱ� ���� �Ʒ� �ڵ�� ������� �ʴ´�.
		char grade;
		
		if (90 <= point) {
			grade = 'A';
		}
		else if (80 <= point) {
			grade = 'B';
		}
		else if (70 <= point) {
			grade = 'C';
		}
		else {
			grade = 'F';
		System.out.println("����: "+ grade);

		}

	}
}
