package com.koitt.class01.java.ch03;

public class TypeCast {

	public static void main(String[] args) {
		// 1.����� ����ȯ
		byte b = (byte)128; 		//int->byte�� ����� ����ȯ
		System.out.println(b);
		
		byte bt = (byte)-129;
				System.out.format("%d�� ������:%s %n", -129,Integer.toBinaryString(-129));
				System.out.format("%d�� ������:%s %n", bt,Integer.toBinaryString(bt));
				
				int n =(int) (5.0 / 4.0);		//����� ����ȯ double -> int 
				System.out.println(n);
				System.out.println(3/ 4);
				System.out.println(3 / 4.0);	//������ ����ȯ int -> double (3)
				
				double d = 3 + 4 * 2;			//������ ����ȯ int -> double (3+4*2)
				System.out.println(d);
	}

}
