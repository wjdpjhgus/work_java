package programming.basic;

public class HelloVar {
	
	public static void main(String[] args) {
		
		//��������-���ڸ���°�
		int var01; 
		
		//�ʱ�ȭ-�ڽ��ȿ� �ִ°�
		var01 = 100;
		
		//���� ���� + �ʱ�ȭ
		int var02 = 100;
		
		
		//���� ������ ����-�ѹ��� ������ �� �ִ�.
		int a1, b1, c1;
		a1=100;
		b1 = 200;
		c1 = 300;
		
		/*int x, y =3,  int x =1, y =3; �̷������� ��밡��
		//���������� �ݵ�� �ʱ�ȭ�� �ؾ� ��밡���ϴ�.
		//int x, y = 3;-x���� �ʱ�ȭ �ؾ� x���� �̿��Ҽ��ִ�.
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
