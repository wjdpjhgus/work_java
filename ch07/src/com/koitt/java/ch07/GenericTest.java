package com.koitt.java.ch07;


/*
 * T는 타입type
 * E는 Element
 */
public class GenericTest<T> {
	public boolean myEqual(T a, T b) {
		return a.equals(b);
	}
	
	/*public boolean myEqual2(String a, String b) {
		return a.equals(b);
	}
	
	public boolean myEqual2(Integer a, Integer b) {
		return a.equals(b);
			
	}*/
	
	//제네릭 안쓰면 이렇게 여러개 써줘야함 하지만 여기서는 Object 쓰면 괜춘
	
	
	public static void main(String[] args) {
		String a = "Hello";
		String b = "Hi";

		Integer c =1;
		Integer d =2;
		
		//String type을 이용하는 myEqual메소드를 호출할 수 있게 된다.
		GenericTest<Object> test = new GenericTest<Object>();
		boolean isEqual = test.myEqual(a, b);
		System.out.println(isEqual);
	
	
		boolean isEqual2 = test.myEqual(c, d); //String으로 하면 ㄴㄴ 그래서 <Object>로
		System.out.println(isEqual2);
	}
}
