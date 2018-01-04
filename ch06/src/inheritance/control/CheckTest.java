package inheritance.control;

import inheritance.access.SavingAccount;

public class CheckTest {
	public static void main(String[] args) {
		
		SavingAccount myAccount = new SavingAccount("김태희",234567654, 0.34);
		myAccount.deposit(400000);
		myAccount.withdraw(50000);
		myAccount.checkBalance();
		
		System.out.println(myAccount.name);			//접근가능-public
		
		//System.out.println(myAccount.open);		
		//접근 불가
		//open 원래 위치 Account에 있는데 상속 받은 클래스의 내부에서는 사용가능
		//(현재클래스는 CheckTest이고 SavingAccount가 아니다)*/
		
		//System.out.println(myAccount.number);		//접근 불가 -default-다른패키지
		//System.out.println(myAccount.balance); 	//접근 불가-private

		CheckAccount cAccount = new CheckAccount("이민정",87542356, 5000000);
		cAccount.deposit(250000);
		cAccount.withdraw(50000);
		cAccount.checkBalance();
		
		System.out.println(cAccount.name);			//접근가능
		System.out.println(cAccount.minimum);		//접근가능-default-같은패키지
		//System.out.println(cAccount.open);		//접근불가 open 원래 위치 Account에 있는데 상속 받은 클래스의 내부에서는 사용가능
		//System.out.println(cAccount.number);		//접근 불가
		//System.out.println(cAccount.balance); 	//접근 불가

	}
}
