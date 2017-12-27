package homework;

import java.util.Scanner;

public class homework09 {
	public static void main(String[] args) {
		
		 Scanner input =new Scanner(System.in);

			  System.out.println("키와 몸무게를 실수로 입력하시오 :");
			   
			  double height;
			  double weight;
			   
			  height = input.nextDouble(); weight = input.nextDouble(); 
			   
			  if (weight <= (height -100)*0.9) {
				  System.out.println("정상");
			  }
			  else if (weight > (height -100)*0.9) {
				  System.out.println("비만");
			  }

	}
}
