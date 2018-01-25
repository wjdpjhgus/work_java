package com.koitt.sql;

public class ExStaticBlock {

	//필드
	static int staticNum =20;
	int num =10;
	
	//static block
	static {
		System.out.println("static block 실행:"+ ExStaticBlock.staticNum);
		
	}
	//instance block// 인스턴스 블로은 생성자보다 먼저 실행되어 앞에 붙는다 따라서 생성자마다 공통적인 코드부분을 인스턴트 블록에 넣어 이용하면 편리
	{
		System.out.print("instance block 실행: ");
		System.out.print(ExStaticBlock.staticNum+ " / ");
		System.out.println(this. num);
	}
	
	//기본생성자
	public ExStaticBlock() {
	System.out.println("기본 생성자 실행: "+this. num);
	}
	public ExStaticBlock(String test) {
		System.out.println("ExStaticBlock(String test) 실행");
	}
	public static void main(String[] args) {
		
		try {
			//객체 생성- 기본생성자 호출
			ExStaticBlock block = new ExStaticBlock();
			
			//static 키워드가 붙은 항목들이 실행
			Class.forName("com.koitt.sql.ExStaticBlock");
			
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
