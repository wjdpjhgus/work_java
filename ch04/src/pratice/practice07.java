package pratice;

public class practice07 {
	public static void main(String[] args) {
	int n;
	int sum;

	
	for(n=1, sum=0; n<100 && sum <=5000; n++) {	
		sum += n;
		
		System.out.println(sum+"  "+n);
	}
System.out.println(sum);

}
}

/*
 * int n = 0;
 * int sum = 0;
 * while (sum < 50000) {
 * n++
 * sum += n;
 * 
 * }
 * System.out.printf("가장 큰 합: %d, 그때의 n:%d,sum-n,--n);
 * 
 */
