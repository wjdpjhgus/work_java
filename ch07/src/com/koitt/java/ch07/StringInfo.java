package com.koitt.java.ch07;

public class StringInfo {
public static void main(String[] args) {
	String snum = "20123458";
	String name = new String("김경석");
	String dept = new String(new char[] {'컴','퓨','터','학','과'});//하나의 문자열 만듦
	String java = new String("java");
	
	System.out.printf("%d ",snum.compareTo("20123458"));//다른게 없으므로 0출력
	System.out.printf("%d %n",snum.compareTo("20123456"));
	System.out.printf("%s ",name);
	System.out.printf("%s ",name.replace('김', '강'));
	System.out.printf("%s %n ",name);//다시 김경석 강으로 바꾸려면 name=name.replace써야함
	System.out.printf("%s ", dept);
	System.out.printf("%s ", dept.substring(0, 3));//0컴1퓨2터3학과
	System.out.printf("%s %n", dept.length());//컴퓨터학과 니깐 5
	System.out.printf("%s ",java.indexOf('a')); //java 01
	System.out.printf("%s ",java.concat(" language"));//붙이는 것
	System.out.printf("%s ",java.replace('j', 'J'));//모든 문자 치환
	System.out.printf("%s ",java.toUpperCase());//대문자로 치환
	System.out.printf("%s ",java.equals("JAVA"));
	System.out.printf("%s ",java.equalsIgnoreCase("JAVA"));//대소문자 구분하지 말고 비교
	System.out.printf("%s ",java.substring(1));//1번부터 출력
}
}
