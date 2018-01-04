package inheritance.access;

public class AccountTest {

	public static void main(String[] args) {
		SavingAccount myAccount = new SavingAccount("강민경", 123567834,0.32);
		myAccount.deposit(50000);
		myAccount.withdraw(4000);
		myAccount.checkBalance();
		
		System.out.println(myAccount.name);		//접근가능
		System.out.println(myAccount.open);		//접근가능
		System.out.println(myAccount.number);	//접근가능
		//System.out.println(myAccount.balance); // 접근불가 balance는 private라 같은 클래스에서만 사용가능

	}

}
