package com.koitt.java.check;

import java.util.Scanner;

public class TestDrive {


	this.input = new SCanner(System.in);

	public static void main(String[] args) {

		TestDrive  td = new TestDrive ();

		Scanner input = new Scanner(System.in);

		while (true) {
			System.out.println("*****도서관 정보시스템*****");
			System.out.println("1. 도서 정보 추가 ");
			System.out.println("2. 도서 정보 삭제 ");
			System.out.println("3. 전체 도서목록출력");
			System.out.println("4. 일반 도서목록출력");
			System.out.println("5. 잡지목록 출력");
			System.out.println("6. 검색 도서 출력");
			System.out.println("7. 프로그램 종료");
			System.out.print("메뉴번호 입력 > ");
			
			int menu = -1;
			
			try { 
				menu = Integer.parseInt(input.nextline());
						

		}
			catch (NumberFormatException e) {
				System.out.println("숫자만 입력하세요");
				continue;
			}
			
			switch (menu) {
			case 1:
				td.menuAdd();
				
			}

	}
}
	public void menuAdd() {
 		System.out.println("=== 도서 추가 ===");
 		return;
	}
}
}
