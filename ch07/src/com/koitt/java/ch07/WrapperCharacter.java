package com.koitt.java.ch07;

public class WrapperCharacter {
public static void main(String[] args) {
	//Character ch = new Character('@');
	Character ch = '@';
	Character ch2 = '@';
	System.out.print(ch + " ");	//unboxing
	System.out.print(ch.charValue()+ " ");
	System.out.println(ch.toString());
	System.out.print(ch.compareTo('@')+" ");//다른 점 개수 만큼 출력됨
	System.out.println(ch.hashCode());
	
	System.out.println(ch2.hashCode());
	System.out.println();
	//정적 메소드
	System.out.print(Character.toUpperCase('d')+" ");//대문자로 바꿔주는거
	System.out.println(Character.toLowerCase('F'));//소문자로 바꿔주는거
	System.out.print(Character.getName('@') + " ");//이름붙이기
	System.out.print(Character.getName('|') + " ");
	System.out.println(Character.getName('^') + " ");
	System.out.print(Character.isDigit('$') + " "); //숫자인가?
	System.out.println(Character.isDigit('5'));
}


}
