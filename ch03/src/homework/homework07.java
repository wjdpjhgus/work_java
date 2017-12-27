package homework;

import java.util.Scanner;

public class homework07 {
	public static void main(String[] args) {
		 Scanner input =new Scanner(System.in);

		   System.out.println("월을 입력하시오 :");
		   
		   int month;
		   month = input.nextInt(); 
		  
		   String CO;
		   
		   CO = month <= 6 ? "상반기입니다" : "하반기입니다";		   
		   System.out.println(CO);
		   
		   }

}
