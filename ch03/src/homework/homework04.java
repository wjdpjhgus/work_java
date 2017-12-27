package homework;
import java.util.Scanner;

public class homework04 {

	public static void main(String[] args) {
		 Scanner input =new Scanner(System.in);

		   System.out.println("¼·¾¾orÈ­¾¾¿Í ¿Âµµ¸¦ ÀÔ·ÂÇÏ½Ã¿À: ");
		   String a;
		   double b;
		   a =input.next(); b = input.nextDouble(); 

		   double F =(9.0/5.0) * b + 32;
		   double C =(5.0/9.0) * (b-32);

		   switch(a) {
		    case "C" :
		    case "c" :
		    System.out.println("¼·¾¾ C"+C+"µµ ÀÌ´Ù.");
		    break;

		    case "F" : 
		    case "f" :
		     System.out.println("È­¾¾ C"+F+"µµ ÀÌ´Ù.");


		   }
	}
}
