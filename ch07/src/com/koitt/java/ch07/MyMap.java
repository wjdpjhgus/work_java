package com.koitt.java.ch07;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MyMap<K, V> {
	private Set<K> keySet;//키 값들을 저장하는 Set
	private List<K> keys;//key값을 저장하는 배열
	private List<V> values;//values값을 저장하는 배열
	private int size;		//데이터의 개수

	//생성자
	public MyMap() {
		keySet= new HashSet<K>();
		keys = new ArrayList <K>();
		values = new ArrayList <V>();
	}

	public void put(K key, V value ) {
		for(int i =0; i< keys.size(); i++) {
			
			//이 조건이 맞으면 해당 key의 value를 수정
			if (keys.get(i).equals(key)) {
				values.set(i, value);
				return;
			}
		}
		keySet.add(key);
		keys.add(key);
		values.add(value);
		size += 1;
	}

	public V get(K key) {
		for (int i= 0; i <keys.size(); i++) {
			if (keys.get(i).equals(key)) {
				return values.get(i);
			}

		}
		return null;
	}

	public Set<K> getkeySet(){
		return this.keySet;
	}
	public static void main(String[] args) {

		MyMap<String, String> map = new MyMap<String, String>();
		map.put("대한민국","서울");
		map.put("일본","동경");
		map.put("중국","북경");
		map.put("중국","북경1");
		//map에 저장 된 Set(keySet)에서 순차적으로 key값을 가져온다.
		for(String key : map.getkeySet()) {
			//순차적으로 가져온 key값을 이용하여 map의 get 메소드를 이용하여 실제 value를 가져온다.
			String value = map.get(key);
			System.out.println(key+":"+value);
		}
	}
}
