package com.koitt.java.ch07;

import java.util.Vector;
import java.util.List;
public class VectorTest {
	
public static void main(String[] args) {
	//제네릭(Generic)
	List<Object> data = new Vector<Object>(3);
	//Vector data = new Vector(3);
	((Vector<Object>)data).addElement(2012);
	data.add("년도");
	((Vector<Object>)data).addElement(4.35);
	data.add(2, "목표학점");
	((Vector<Object>)data).insertElementAt("자바강좌", 0);
	System.out.println("size =" +data.size());//몇개가 들어가 있는지
	System.out.println("capacity = " +((Vector<Object>)data).capacity());//원래 3이었다가 공간이 부족하니깐 2배로 늘려서 6
	System.out.println(data.toString());
}
}
