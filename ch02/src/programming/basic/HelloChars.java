package programming.basic;

public class HelloChars {

	public static void main(String[] args) {
		System.out.println('a');		//char ��
		System.out.println('\\');		// \���
		System.out.println('\142');		////8���� 142(=98)�� ASKII �ڵ尪
		System.out.println('\uAC00');	//UTF-8(unicode) �� AC00:��
		System.out.println('\uAC01');	//unicode �� AC01:��
		System.out.println('��');

		System.out.println("hello\nworld\tHi\b\rABC\r\n");// \n�� ���� \t�� �� \b�� �齺���̽� 	\n��\t������ �˾Ƶα�
			System.out.println("\'");

	}

}
