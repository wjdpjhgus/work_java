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

/*
 *double money =1000000;
 *1년에서 10년까지
 *for (int year =1; year <= 10; year ++) {
 *    double result -,oney*(1+0.045*year);
 *    System.out.printf("%d년: %.0f원%n", year, result);
 *}
 */

