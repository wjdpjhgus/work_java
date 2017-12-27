package operator;

public class IncDecOP {

	public static void main(String[] args) {
		int m = 50, n = 30;
		System.out.printf("%d %d %n", m--, n++);//뒤에 붙으면 먼저사용하고 증감한다는 뜻
		System.out.printf("%d %d %n", m, n);
		System.out.printf("%d %d %n", --m, ++n);//앞에 붙으면 먼저 증감 시키고 사용한다는 뜻
		System.out.printf("%d %d %n", m, n);
	}

}
