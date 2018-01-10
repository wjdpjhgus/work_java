package com.koitt.java.ch07;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorForEach {

	public static void main(String[] args) {

		ArrayList<Integer> array = new ArrayList<Integer>();
		array.add(10);
		array.add(20);
		array.add(30);
		array.add(40);


		//for each
		for(int item : array) {
			System.out.println(item);
		}
		
		//for-each문의 원리 iterator    //처음부터 돌리기//다음거있냐고 물어보기
		for(Iterator<Integer> i =array.iterator(); i.hasNext();) {
			Integer item = i.next();//다음거 끄집기
			System.out.println(item);
			
		}
		
	}
}