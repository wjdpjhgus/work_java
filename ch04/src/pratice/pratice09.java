package pratice;

public class pratice09 {

	public static void main(String[] args) {
		int prime[]=new int[1001];
		int n;
		int k;
		int mul;
		for (n=2,k=2,mul=1; n<=1001; n++,k++) {
			prime[n]=1;
			mul=n*k;
			continue;
			System.out.println(mul);
		}

	}

}
