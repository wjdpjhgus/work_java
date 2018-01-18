package practice;

public class BankAccount {
	//필드
	private int minBalance; //최저잔금 지정
	private int money; 

	private int balance;//잔금


	public BankAccount(int minBalance) {
		super();
		this.minBalance = minBalance;
	}

	//입금 매소드
	public void deposit(int money) {
		this.balance += money;
		System.out.println("정상 입금처리: 입금금액="+ money + ", 잔금= "+ this.balance);
	}

	//출금메소드
	public void withdraw(int money) throws InvalidWithdraw {
		if (money >= 0 && this.balance - money > this.minBalance) {
		
				this.balance -= money;
				System.out.println("정상 출금처리: 인출금액="+ money + ", 잔금= "+ this.balance);
				
		}
		else {
				throw new InvalidWithdraw("초과출금 요구 예외");
			
		}
	}
}
