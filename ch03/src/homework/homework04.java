package homework;
import java.util.Scanner;

public class homework04 {

	public static void main(String[] args) {
		 Scanner input =new Scanner(System.in);

		   System.out.println("섭씨or화씨와 온도를 입력하시오: ");
		   String a;
		   double b;
		   a =input.next(); b = input.nextDouble(); 

		   double F =(9.0/5.0) * b + 32;
		   double C =(5.0/9.0) * (b-32);

		   switch(a) {
		    case "C" :
		    case "c" :
		    System.out.println("섭씨 C"+C+"도 이다.");
		    break;

		    case "F" : 
		    case "f" :
		     System.out.println("화씨 C"+F+"도 이다.");


		   }
	}
}
