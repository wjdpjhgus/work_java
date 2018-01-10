package com.koitt.java.ch07;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapTest {
	public static void main(String[] args) {
		Map<String, String> hm	= new HashMap<String, String>();//객체만들기

		hm.put("대한민국", "서울");//기능상에 차이가 있어 add말고 put을 사용
		hm.put("일본", "동경");
		hm.put("중국", "북경");
		hm.put("태국", "방콕");
		hm.remove("태국");//태국이라는 키값을 삭제
		hm.put("중국", "북경1"); 	//기존 중국 키 값을 가지는 값을 갱신해버린다.


		System.out.print("키: " +hm.keySet());//앞에서 나왔던 set이 나옮
		System.out.println(" 값 : "+ hm.values());
		System.out.println();

		//Iterator이용
		Iterator<String> keys =hm.keySet().iterator();
		while (keys.hasNext()) {
			String key = keys.next();
			String value = hm.get(key);
			System.out.println(key +": "+ value);
		}
		System.out.println();

		//for-each문
		for (String key : hm.keySet()) { //셋이라는 주머니에서 키를 하나씩 끄집어 낸다
			String value = hm.get(key);
			System.out.println(key +": "+ value);

		}
		System.out.println();
		//key값을 알고 있어서 직접key값을 입력하여 값을 끄집어 낸다.
		String value = hm.get("대한민국");	

		System.out.println(value);
	}
}
