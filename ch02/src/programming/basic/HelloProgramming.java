package programming.basic;

public class HelloProgramming {
	
	//�ν��Ͻ� ����(Instance Variable=�ʵ�=��� ����)����-���� �����ϸ� ���� ����� ������ �ٲ� �ʿ䰡 ����.
	static String fd = "--�ʵ�";
	static String md = "--�޼ҵ�";
		
	//�ڹ� ���α׷��� �����ϴ� main() �޼ҵ� ����
	public static void main(String[] args) {
		System.out.println("�ڹ� Ŭ������ ����");
		write(fd);//�ؿ� word�� �־ �ѹ��� �۵���ų �� ���� 
		write(md);
		write("�ȳ��ϼ���");
	}
	//���α׷��Ӱ� �����ϴ� �޼ҵ� write()�� ����
	public static void write(String word) {
		System.out.println(word);
		
	}
}
