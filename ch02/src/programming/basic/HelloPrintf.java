package programming.basic;

public class HelloPrintf {

	public static void main(String[] args) {
		System.out.println("123456 123456 123456");
		System.out.println("--------------------");
		/*
		 * d(Decimal):10����
		 * o(Octal):8����
		 * h(Hexadecimal),x,H:16����
		 * 1$��  ù��°���ڸ��Ѵ�.128
		 * 2$ �� �ι������ 300
		 * %1$6.2f 6ĭ �Ҽ���°�ڸ����� �ݿø��ؼ� ǥ��
		 */
		System.out.format("%6d %6o %6h %n",  10, 10, 10);	//6ĭ�����ϴµ� ���������� 
		System.out.format("%-6d %-6o %-6h %n",  20, 20, 20);//6ĭ�����ϴµ� ��������
		System.out.format("%+6d %6o %6H %n",  30, 30, 30);
		System.out.format("%1$6d %1$6o %1$6h %n",  128, 300);
		System.out.printf("%1$6.2f %1$6.3f %1$6.4f %n",  3.141592);
	
	}

}
