package com.koitt.java.ch07;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.List;
public class LinkedListTest {
public static void main(String[] args) {
	List<Object> list = new LinkedList<Object>();
	
	list.add("pascal");		
	((LinkedList<Object>)list).addLast(1);
	list.add("java");		
	((LinkedList<Object>)list).addLast(3.4);
	((LinkedList<Object>)list).addFirst("algol");	
	((LinkedList<Object>)list).addFirst(0.87);
	list.add(3, null);		
	((LinkedList<Object>)list).addLast(5.8);
	
	Iterator<Object> it = list.iterator();
	print(it);
	print(((LinkedList<Object>)list).descendingIterator());
	
	for( Object e : list.toArray()) {// 오브젝트 배열이 리턴 배열에 원소를 끄집어 내면 e가됨
		System.out.print(it.next() + " ");
	}
	System.out.println();
}

public static void print(Iterator<Object> it) {
	while(it.hasNext())	{
		System.out.println(it.next()+ " ");
		
	}
	System.out.println();
}


}
