package practice;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetUse {

	public static void main(String[] args) {
		HashSet<String> A = new HashSet<String>();
		HashSet<String> B = new HashSet<String>();
		
		Scanner input= new Scanner(System.in);
		
		System.out.println ("표준입력으로 문자열을 여러 줄에 입력하세요");
		System.out.println ("결과를 보시려면 마지막에 표준입력으로 quit를 입력하세요");
		
		  String A =input.nextString();
		Integer date =input.nextInt();
		input.close();
	}
	
}
