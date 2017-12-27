package operator;

public class DevideByZero {

	public static void main(String[] args) {
		short data1 = 32766;
		short data2 = 1;
		
		short data3 = (short)(data1 + data2);
		short data4 = 32766 + 1;
		//short data3 = data1 + data2; //더한 결과 가 int형으로 변환됨
		System.out.println(data3 + ""+ data4);
		
		System.out.println(0.0 / 0.0);	//Not a Number(숫자가 아니다)
		System.out.println(3 / 0.0); 	//무한대(3이 double 형으로 변환되어 실수 나누기)
		System.out.println(3/ 0);		//정수 범위에서는 0으로 나눌 수 없기 때문에 예외 발생
		
		String money = "1000"; //NaN을 넣을 경우 잔고가 날라아가기 때문에 if쓴다.
		double moneyDouble = Double.parseDouble(money);
	
		if (!Double.isNaN(moneyDouble)) {
		double balance = 30000;
		balance = balance + moneyDouble;
		System.out.println(balance);
		
		}
		else {
			System.out.println("금액을 다시 입력해주세요");
		}
				

	}

}
