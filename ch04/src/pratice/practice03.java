package pratice;

import java.util.Scanner;

public class practice03 {

	public static void main(String[] args) {
		
			Scanner input =new Scanner(System.in);
			System.out.println("정수입력 ");
			String num = input.next();
			
			
			/*for (int i= num.length()-1; i>= 0; i--) {//num.length():글자 수 리턴 글자 개수 알아 먹는 메소드
			String result = num.CharAt(i);
			*/
			
			/*do{
			 * System.out.print(num % 10);
			 * num = num/10
			 * 
			 * while(num>0);
			 */
			int i = num.length()-1;
		do {
			char result = num.charAt(i);
			System.out.print(result);
			i--;
		}
		while (i >= 0);
			
		input.close();
	}

}
