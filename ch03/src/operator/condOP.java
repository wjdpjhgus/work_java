package operator;

public class condOP {

	public static void main(String[] args) {
		int point = 31;
		String str = (point%2 == 0) ? "�ۼ�" : "Ȧ��" ;
		System.out.printf("%d�� %s��. %n", point, str);
		
		double x = 3.45, y = 6.79 ;
		double max = (x >y) ? x : y ;
		System.out.printf("%.2f�� %.2f�߿��� %.2f�� �� ũ��.",x,y,max);
		
	}

}
