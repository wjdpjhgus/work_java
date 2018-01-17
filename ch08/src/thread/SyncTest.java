package thread;

import java.util.Random;

class BankAccount {
	int balance = 0;		//은행 잔고

	//인출
	public synchronized void withdraw(int money) {
		//현재 출금하려는 금액보다 잔고가 많은지 검사
		if (money >= 0 && this.balance >= money) {
			try {
				Thread.sleep(100);//sleep작성하려면 예외처리 필요함
			}
			catch (InterruptedException e) {
				System.out.println(e);
			}

			this.balance -= money;
			System.out.printf("%s가 %d 인출하여 현재잔고 %d 입니다. %n", Thread.currentThread().getName(),money, this.balance);
		} 

		//돈부족해서 출금할 수 없는 경우
		else if (this.balance< money)
			System.out.println(Thread.currentThread().getName()+"잔고가 부족하여" +money+"인출할 수 없습니다.");

	}

	//입금
	public void deposit(int money) {
		synchronized (this) {
			//입금 금액이 양수인가
			if (money > 0) {
				balance +=money;
				System.out.printf("%s가 %d 입금하여 %s 현재잔고 %d 입니다. %n", Thread.currentThread().getName(),money, Thread.currentThread().getName(),balance);
			}
		}
	}
}

public class SyncTest implements Runnable {
	BankAccount act = new BankAccount();

	public void run() {
		//while(true) {
		for(int i=0; i<3; i++) {
			int amount = new Random().nextInt(10000);//0~10000가지 랜덤하게 숫자를 끄집어 낸다.
			amount = amount%10*1000; //끄집어낸 숫자를 10으로 나눈 나머지 곱하기 1000이다.
			System.out.printf("[%s] 금액 =%d %n", Thread.currentThread().getName(), amount);
			act.deposit(amount);//입금
			act.withdraw(amount*2);//출금 2배로 한 이유는 잔고를 바닥나게 하기 위해서
			if(act.balance<0) {
				System.out.printf("[%s] ", Thread.currentThread().getName());
				System.out.println("잔고: "+act.balance+ " =>오류 종료");
				return ;
			}
			
		}
	}
	public static void main(String[] args) {
		Runnable r =new SyncTest();
		Thread th1 =new Thread(r);
		Thread th2 =new Thread(r);
		th1.setName("철수");
		th2.setName("영희");
		th1.start();
		th2.start();
	}

}
