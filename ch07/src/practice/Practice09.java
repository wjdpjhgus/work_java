package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Practice09 {
	public static void main(String[] args) {
		Map<String, String> phoneBook	= new HashMap<String, String>();
		phoneBook.put("홍길동", "010-1234-5678");
		phoneBook.put("강소라", "010-1111-5678");
		phoneBook.put("오연서", "010-2222-5678");
		
		System.out.println("검색할 이름을 적으세요 >>");
		
		Scanner input = new Scanner(System.in);
		String name = input.next();
		
		String phone = phoneBook.get(name);
		System.out.println("입력하신"+name+"의 전화번호는"+phone+"입니다.");
	}
}
