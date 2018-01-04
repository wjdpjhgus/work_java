package com.koitt.java.class03;

public class TestDrive {

	public static void main(String[] args) {
		//케이 고양이 한마리 생성				
		Cat kei = new Cat("케이", 1);
		
		//주인 생성-강예은 주인 kei라는 고양이를 소유한다.
		Cat[] cats =new Cat[2];
		cats[0] = new Cat("일냥이",3);
		cats[1] = new Cat("이냥이",2);
		Owner yeEun = new Owner("강예은","서울",cats);
		//주인이 소유한 고양이를 소개하는 메소드를 호출
		yeEun.introCat();
			
		// 해피 고양이 한마리 생성
		Cat happy =new Cat("해피", 5);
		
		
		
		//주인생성- 홍길동 주인이 해피라는 고양이 소유
		Cat[] cats2 =new Cat[3];
		cats2[0] = new Cat("삼냥이",2);
		cats2[1] = new Cat("사냥이",1);
		cats2[2] = new Cat("오냥이",1);
		Owner gildong = new Owner("홍길동", "부산", cats2);
		//주인이 소유한 고양이를 소개하는 메소드를 호출
		gildong.introCat();
		
		//분양 받을 고양이를 생성한다.
		Cat haapy2 =new Cat("해피 2호",1);
		//주인(홍길동)이 새로 고양이를 분양받는다.
		gildong.setCat1(cats);
		
		//주인 홍길동이 새로 분양 받은 고양이를 소개한다.
		gildong.introCat();
		
		
	}
	
}
