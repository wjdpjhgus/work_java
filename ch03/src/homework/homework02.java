package homework;

import java.util.Scanner;

public class homework02 {
	
	public static void main(String[] args) {

		//����2
		Scanner input = new Scanner(System.in);

		System.out.println("���� �ΰ��� �Է��Ͻÿ�: ");

		int A = (int)input.nextDouble(); int B =(int)input.nextDouble();
		
		double sum = A+B;
		double ave = sum/2;
		
		System.out.println(A);
		System.out.println(B);
		System.out.println("�� ������ ���� " +sum+"�����"+ ave + "�̴�");
		
	}

}