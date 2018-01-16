package com.koitt.java.board;

import java.util.Date;
import java.util.Scanner;

public class BoardController {
	//필드
	private BoardService service;
	private Scanner input;

	//생성자
	public BoardController () {
		//서비스 사용을 위한 객체생성
		this.service= new BoardService();

		this.input= new Scanner(System.in);


	}

	public static void main(String[] args) {
		BoardController controller = new BoardController();
		Scanner input = new Scanner(System.in);

		while (true) {
			System.out.println("=== 인적사항 관리 프로그램 ===");
			System.out.println("1. 게시물 입력");
			System.out.println("2. 게시물 전체출력");
			System.out.println("3. 게시물 삭제");
			System.out.println("4. 게시물 수정");
			System.out.println("5. 프로그램 종료");
			System.out.print("메뉴번호 입력 > ");

			// 입력받은 메뉴번호
			int menu=-1;

			try {
				menu = Integer.parseInt(input.nextLine()); // 한 줄 단위로 입력받음(String 타입)
			}
			catch (NumberFormatException e) {
				System.out.println("메뉴는 숫자로만 입력하세요");
				//return;->프로그램 종류
				continue;
			}
			switch (menu) {
			case 1:
				controller.menuAdd();
				break;

			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				System.out.println("프로그램 종료하겠습니다. 안녕히 계세요~");
				System.exit(0);	// 프로그램 종료, 0: 정상종료, -1: 비정상종료
				// exit의 숫자는 운영체제가 사용
				break;
			default:
				System.out.println("메뉴 번호를 잘못 입력하셨습니다.");	
			
			}
		}
	}


public void menuAdd() {
	
	System.out.println("===게시정보를 입력해주세요===");
	Date regDate= new Date();
	System.out.println("제목: ");
	String title=this.input.nextLine();

	System.out.println("내용: ");
	String content=this.input.nextLine();

	System.out.println("작성자: ");
	String writer=this.input.nextLine();

	Board b = new Board(title, content, writer, regDate);
}



}


