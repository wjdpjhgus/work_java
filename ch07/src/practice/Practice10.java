package practice;

import java.util.Scanner;

public class Practice10 {
	public static void main(String[] args) {
		MyData<String,String,String> mydata = new MyData<>();
		mydata.put("김이용", "KT", "0101010101");
		mydata.put("김일용", "SKT", "0103240101");


		System.out.println("검색할 이름을 적으세요>>");
		Scanner input = new Scanner(System.in);
		String name = input.next();

		
		mydata.search(name);
		input.close();
	}
}

