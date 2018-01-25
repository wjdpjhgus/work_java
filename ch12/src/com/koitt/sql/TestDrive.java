package com.koitt.sql;

public class TestDrive {
	
	static {
		/*
		 * TestDrive 클래스는 main메소드를 포함하고 있는데 자바가상머신이 main부터 실행을 위해 
		 * TestDrive 클래스 정보를 메모리에 올려야 하기 때문에 static block이 실행
		 */
		System.out.println("TestDrive static block실행 ...");
	}
	public static void main(String[] args) throws ClassNotFoundException{
		//Class.forName("com.koitt.sql.ExStaticBlock");//static block만 실행
		new ExStaticBlock();
		new ExStaticBlock();//두번째 부터는 static블록실행x
		new ExStaticBlock("테스트");
	}
}
