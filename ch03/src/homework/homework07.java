package homework;

import java.util.Scanner;

public class homework07 {
	public static void main(String[] args) {
		 Scanner input =new Scanner(System.in);

		   System.out.println("���� �Է��Ͻÿ� :");
		   
		   int month;
		   month = input.nextInt(); 
		  
		   String CO;
		   
		   CO = month <= 6 ? "��ݱ��Դϴ�" : "�Ϲݱ��Դϴ�";		   
		   System.out.println(CO);
		   
		   }

}
