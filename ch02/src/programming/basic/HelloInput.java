package programming.basic;

public class HelloInput {
	
	public static void main(String[] args) {
		
		//System.in�� Ű������ �Է½�Ʈ��
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("�̸��� �й��� �й��� �Է��ϼ���.");
		
		//�Է¹��� ���ڿ��� ��ū���� ������� ���ڿ� �Ϻθ� ����
		String name = input.next();//.�� �޼ҵ忡 �����Ѵ� ȣ���Ѵ�.
		int num = input.nextInt();
		String major = input.next();
		System.out.println("�̸�: " + name + ", �й�: " + num + ", �а�: " + major);
	}

}