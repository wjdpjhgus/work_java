package homework;

import java.util.Scanner;

public class homework09 {
	public static void main(String[] args) {
		
		 Scanner input =new Scanner(System.in);

			  System.out.println("Ű�� �����Ը� �Ǽ��� �Է��Ͻÿ� :");
			   
			  double height;
			  double weight;
			   
			  height = input.nextDouble(); weight = input.nextDouble(); 
			   
			  if (weight <= (height -100)*0.9) {
				  System.out.println("����");
			  }
			  else if (weight > (height -100)*0.9) {
				  System.out.println("��");
			  }

	}
}
