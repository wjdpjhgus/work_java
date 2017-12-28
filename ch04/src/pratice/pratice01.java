package pratice;

public class pratice01 {

	public static void main(String[] args) {
		int i;
		for (i=1; i <= 100; i ++) {
			if ( i % 2 == 0 ) {
				continue;
			}	
			if	( i % 3 == 0 ) {
					continue;
			}	
			if	( i % 5 == 0 ) {
					continue;
			}
			
			if	( i % 7 == 0 ) {
						continue;
			}
			System.out.println(i);
			}
	}
}