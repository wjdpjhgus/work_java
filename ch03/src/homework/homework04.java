package homework;
import java.util.Scanner;

public class homework04 {

	public static void main(String[] args) {
		 Scanner input =new Scanner(System.in);

		   System.out.println("����orȭ���� �µ��� �Է��Ͻÿ�: ");
		   String a;
		   double b;
		   a =input.next(); b = input.nextDouble(); 

		   double F =(9.0/5.0) * b + 32;
		   double C =(5.0/9.0) * (b-32);

		   switch(a) {
		    case "C" :
		    case "c" :
		    System.out.println("���� C"+C+"�� �̴�.");
		    break;

		    case "F" : 
		    case "f" :
		     System.out.println("ȭ�� C"+F+"�� �̴�.");


		   }
	}
}
