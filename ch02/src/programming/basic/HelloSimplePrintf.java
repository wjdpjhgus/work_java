package programming.basic;

public class HelloSimplePrintf {

	public static void main(String[] args) {
		byte age = 27;
		int weight = 70;
		double height = 175.8;
		
		/*%d:10����
		 * %f:float��
		 * %s:String ��
		 * %c:char��
		 * escape sequence
		 */
		System.out.printf("����: %d, ������: %d, Ű: %f, \n", age, weight, height);//��� ����Ұ��� ���ϰ� %0�� ��ĭ
		System.out.printf("%s: %c ��", "������", 'O');//���� ,������ ��ĭ(%0)�� �� ��

	}

}
