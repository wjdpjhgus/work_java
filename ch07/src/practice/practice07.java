package practice;

import java.util.HashSet;
import java.util.Scanner;

public class practice07 {
	public static void main(String[] args) {
		System.out.println ("표준입력으로 문자열을 여러 줄에 입력하세요");
		System.out.println ("결과를 보시려면 마지막에 표준입력으로 quit를 입력하세요");

		Scanner input= new Scanner(System.in);//한줄 받고 공백으로 짜르는것과 하나씩 받는것
		HashSet<String> A = new HashSet<String>();//중복되지 않은 문자열저장(모든 문자열 다들어감)
		HashSet<String> B = new HashSet<String>();//중복된 문자열 저장(중복된것만 들어가 있음)
		

		//무한루프돌리다가 종료어 입력하면 종료하도록
		while (true) {
			String text = input.next();//공백이나 엔터 기준으로 들어감
			if (text.equals("quit")) {
				break;
			}
			boolean 이거중복되니= !A.add(text);//add가 들어가면 true /add메소드는  중복되면 안들어간다->false로 나옮
			if(이거중복되니) {
				B.add(text);
				
			}
		}
			A.removeAll(B);
			System.out.println("중복되지 않은 문자열=>"+ A.toString());
			System.out.println("중복된 문자열=>"+B);
		}//set은 순서대로 x 
	

}
