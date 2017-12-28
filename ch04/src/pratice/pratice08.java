package pratice;

public class pratice08 {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		int d;
		
		int data[][] = {{78, 48, 78, 98},{99,92},{29,64,83},{34,78,92,56}};
		
		for (int ary[] : data) {
			for (int value : ary) 
				System.out.print(value + " ");
		}
		a = data[0][0]+data[0][1]+data[0][2]+data[0][3];
			
		b = data[1][0]+data[1][1];
			
		c = data[2][0]+data[2][1]+data[2][2];
			
		d = data[3][0]+data[3][1]+data[3][2]+data[3][3];
		
		System.out.println(" 합: "+a+" 평균: "+a/(data[0].length)+" 합: "+b+" 평균: "+b/(data[1].length)+" 합: "+c+" 평균: "+c/(data[1].length)+" 합: "+d+" 평균: "+d/(data[1].length));
			

		}

	}
	


