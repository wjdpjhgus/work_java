package operator;

public class IncDecOP {

	public static void main(String[] args) {
		int m = 50, n = 30;
		System.out.printf("%d %d %n", m--, n++);//�ڿ� ������ ��������ϰ� �����Ѵٴ� ��
		System.out.printf("%d %d %n", m, n);
		System.out.printf("%d %d %n", --m, ++n);//�տ� ������ ���� ���� ��Ű�� ����Ѵٴ� ��
		System.out.printf("%d %d %n", m, n);
	}

}
