package homework;

import java.util.Scanner;

public class homework08 {

	public static void main(String[] args) {
		
		 Scanner input =new Scanner(System.in);

			  System.out.println("������ ������ �Է��Ͻÿ� :");
			   
			  int a;
			  int b;
			  int c;
			   
			  a = input.nextInt(); b = input.nextInt(); c = input.nextInt(); 
			   
			  int firstcompare;
			  firstcompare = a >= b ? a : b;		   
			   
			  int lastcompare;
			  lastcompare = firstcompare >= c ? firstcompare : c;
			   
			  System.out.println(lastcompare);
	}

}