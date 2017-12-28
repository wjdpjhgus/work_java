package pratice;

public class pratice05 {

	public static void main(String[] args) {
		int i;
		int cash;
		int b;
		
		cash=1000000;
		
for(i=1; i <=9; i++) {
	b=(int)(cash * 0.045 * i);
	System.out.println(b);
	}
	for( i=10; i==10; i++) {
		int c= (int)(cash*(1+(0.045)*i));
		System.out.println(c);
	}
}
}

