package practice;

public class 자바7장까지내용정리 {
	/*
	 * 2장
	 * 
	 * 필드
	 * 
	 * 메소드
	 *void : 반환값이 없다는 뜻
	 *키워드
	 *
	 *식별자
	 *
	 *문장: 명령을 내리는 최소단위 /블록({})
	 *;으로 문장종료
	 *
	 *
	 *
	 *
	 */

	public static void main(String[] args) {
		int i =1;
		while (i <=3) {
			System.out.println(i++);
		}
		
		
		
		i=1;
		do {
			System.out.println(i++);
		}
			while (i<=3);
		
		for(i=1; i<=3; i++) {
			System.out.println(i);
		}
	}
}
