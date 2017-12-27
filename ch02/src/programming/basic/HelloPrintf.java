package programming.basic;

public class HelloPrintf {

	public static void main(String[] args) {
		System.out.println("123456 123456 123456");
		System.out.println("--------------------");
		/*
		 * d(Decimal):10진수
		 * o(Octal):8진수
		 * h(Hexadecimal),x,H:16진수
		 * 1$는  첫번째숫자말한다.128
		 * 2$ 는 두번재숫자 300
		 * %1$6.2f 6칸 소수둘째자리까지 반올림해서 표시
		 */
		System.out.format("%6d %6o %6h %n",  10, 10, 10);	//6칸차지하는데 오른쪽정렬 
		System.out.format("%-6d %-6o %-6h %n",  20, 20, 20);//6칸차지하는데 왼쪽정렬
		System.out.format("%+6d %6o %6H %n",  30, 30, 30);
		System.out.format("%1$6d %1$6o %1$6h %n",  128, 300);
		System.out.printf("%1$6.2f %1$6.3f %1$6.4f %n",  3.141592);
	
	}

}
