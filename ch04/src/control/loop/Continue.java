package control.loop;

public class Continue {

	public static void main(String[] args) {
		int i =1;
		for (i = 1; i<= 10; i++) {
			if (i%3 == 0) {
				continue; //true면 i++로 되돌아가라
			}
			System.out.print(i +" ");
		}
		System.out.println();
	}

}
