package practice;

public class Ex03 {

	public static void main(String[] args) /*throws InvalidWithdraw*/ {
		BankAccount ba =new BankAccount(-100000);
		ba.deposit(100000);
		ba.withdraw(100000);
		ba.withdraw(200000);
	}
}
