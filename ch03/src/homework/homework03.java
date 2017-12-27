package homework;
import java.util.Scanner;

public class homework03 {

	public static void main(String[] args) {
		 Scanner input =new Scanner(System.in);

		   System.out.println("킬로그램을 입력하시오 :");
		 
		   double kg;
		   kg = input.nextDouble(); 

		   double pd ;
		   
		   pd = kg/0.453592;

		    System.out.printf("파운드 : %.3f", pd);
		   

		   

		   }
	}

