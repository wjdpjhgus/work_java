package com.koitt.java.ch07;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
public static void main(String[] args) {
	HashSet<Integer> setA = new HashSet<Integer>();
	HashSet<Integer> setB = new HashSet<Integer>();
	
	setA.add(3);
	setA.add(5);
	setA.add(7);
	setA.add(8);
	setA.add(7);
	setA.add(9);
	System.out.print("A = ");
	print(setA);
	//println에서 자동으로Argument로 전달 받은 객체의 toString 메소드를 호출한다.
	System.out.println(" A = "+ setA.toString());
	
	
	setB.add(5);
	setB.add(3);
	setB.add(2);
	System.out.print("B= "); //set은 넣는 순서대로가 아니라 오름차순으로 정렬되어 들어감
	print(setB); 
	System.out.println(" B = "+ setB);
	
	
	boolean isChanged = setA.removeAll(setB);
	System.out.print(" A - B = ");
	if(isChanged)System.out.println(setA);;

	
	//for-each문
	System.out.print("for-each문으로 출력: ");
	for (Integer i : setA) {
		System.out.print(i+ " ");
	}
}


public static void print(HashSet<Integer> s) {
	Iterator<Integer> i =s.iterator();
	while (i.hasNext())
		System.out.print(i.next()+" ");
}
}
