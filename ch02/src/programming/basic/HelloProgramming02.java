package programming.basic;

public class HelloProgramming02 {
	//�ڹ� �޸𸮿� �ø��� ������ �����ϴ� ������ �ٸ���. �׷���Static����ؼ� �ν��ϰ� �Ѵ�.
	static String hello = "�ȳ��ϼ���. ����(����)����-static �ʿ�";
	
	public static void main(String[] args) {
			String hello2 = "��������-���������� ��밡�� ��� static��� ����";
			System.out.println(hello);
			System.out.println(hello2);
			print9(hello2);
	}
	static void print9(String val) {
		System.out.println(val);
		System.out.println(val);
		System.out.println(val);
		System.out.println(val);
		System.out.println(val);
		System.out.println(val);
		System.out.println(val);
		System.out.println(val);
		
	}
}
