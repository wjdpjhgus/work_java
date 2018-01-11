package practice;

import java.util.HashMap;
import java.util.Map;

public class Practice08 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		String[] words = new String[7];
		words[0]= new String("java");
		words[1]= new String("c");
		words[2]= new String("java");
		words[3]= new String("cpp");
		words[4]= new String("cpp");
		words[5]= new String("cobol");
		words[6]= new String("java");

		for (int i = 0; i < words.length; i++) {
			//put 메소드의 리턴 값은 해당key의 이전 value를 리턴한다.
			Integer num = map.put(words[i], map.get(words[i]));
			if (num ==null) {
				map.put(words[i], 1);
			}
			else {
				map.put(words[i], map.get(words[i])+1);
			}
		}
		
		for (String key : map.keySet()) {
			System.out.println(key+" : "+map.get(key));
		}

		
		Map<String, Integer> map2 = new HashMap<String, Integer>();
		Integer num2 = map2.put("count",1);
		System.out.println("count key값의 이전 value값: "+ num2 +" / 현재 count의 value값: " + map2.get("count"));
		
		Integer num3 = map2.put("count",map2.get("count")+1);
		System.out.println("count key값의 이전 value값: "+ num3 +" / 현재 count의 value값: " + map2.get("count"));
	}
}
