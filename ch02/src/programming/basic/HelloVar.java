package programming.basic;

public class HelloVar {
	
	public static void main(String[] args) {
		
		//변수선언-상자만드는것
		int var01; 
		
		//초기화-박스안에 넣는것
		var01 = 100;
		
		//변수 선언 + 초기화
		int var02 = 100;
		
		
		//여러 변수의 선언-한번에 선언할 수 있다.
		int a1, b1, c1;
		a1=100;
		b1 = 200;
		c1 = 300;
		
		/*int x, y =3,  int x =1, y =3; 이런식으로 사용가능
		//지역변수는 반드시 초기화를 해야 사용가능하다.
		//int x, y = 3;-x값을 초기화 해야 x값을 이용할수있다.
		System.out.println(x);
		*/
		
		byte b =0xA;
		short s = 32767;
		long distance = 1500_00_000000L;
		double d = 1500E8D; 	//1500x10^8
		int x, y = 10, z= 20 ;
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(distance);
		System.out.println(d);
		System.out.println(y);
		System.out.println(z);
		
	}

}
