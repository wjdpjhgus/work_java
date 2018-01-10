package enumeration;

public class EnumTest {
public enum P1 {c, cpp, java, csharp};
public int [] a = {10,20,30,40};


public static void main(String[] args) {
	P1 clang =P1.c;
	System.out.println(clang.toString());
	
	clang = P1.csharp;
	switch(clang) {
	case csharp:
		System.out.println(clang + ": C# 언어 ");
		
	}
	//for_each문
	for (P1 p : P1.values())
		System.out.print(p+ " ");
	System.out.println();
	
	//오류 방법 static 쓰거나 객체 만들기
	EnumTest t= new EnumTest();//객체
	for(int item : t.a) {
		System.out.println(item);
		
	}
}
}
