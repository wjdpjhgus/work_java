package pratice;

import java.util.Scanner;

public class homework02 {

	public static void main(String[] args) {

		
		Scanner input =new Scanner(System.in);
		//표준입력 받기
		System.out.println("행의 별개수를 입력하시오 :");
		int star;
		int i = star = input.nextInt(); 
		//배열선언 및 초기화
		char [][]data =new char [i][];

		//레기드 배열만들기
		for (i=0; i < data.length; i++ ) {
			data[i] =new char [i+1];// []안쪽은 행과열의 주소!! 직접들어가는 숫자가 아니다.
		}
		//별을 배열에 저장 및 출력
		for (i = 0; i <data.length; i++) {
			for (int j =0; j<data[i].length; j++) {

				data[i][j] ='*';

				System.out.print(data[i][j]+" ");
			}
			System.out.println();
		}
		input.close();
	}
}

/*
 * //정사각형 배열로 풀이
 * 
		Scanner input =new Scanner(System.in);
		//표준입력 받기
		System.out.println("행의 별개수를 입력하시오 :");
		int star;
		int i = star = input.nextInt(); 
		//배열선언 및 초기화
		char [][]data =new char [i][i];
		
		for(i =0; i < data.length; i++) {
		for (int j = 0; j < data,length; j++) {
			if( i>= j) {
			data[i][j] ='*';
 * 		}
 * else {
 * data[i][j]= ' ';
 * }
 * 	}
 * }
 * 
 * 
 */

