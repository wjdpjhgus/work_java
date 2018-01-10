package com.koitt.java.ch07;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class ArrayListTest {
	public static void main(String[] args) {
		List<Object> list  = new ArrayList<Object>();

		list.add(0.87);
		list.add("algol");
		list.add("pascal");	
		list.add(null);
		list.add(1);
		list.add("java");
		list.add(3.4);
		list.add(5.8);

		Iterator<Object> it = list.iterator();
		print(it);
	
		for (Object e : list.toArray()) {
			System.out.print(e +" ");
		}
		
		for (int i =0; i < list.size(); i++) {
			Object e = list.get(i);
		System.out.println(e+  " ");
		}
	}
	

	private static void print(Iterator<Object> it) {
		while (it.hasNext()) {
			System.out.println(it.next()+ " ");
		}
		System.out.println();
	}
}
