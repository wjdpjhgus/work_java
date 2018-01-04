package practice;

public class Account {

	private String owner;
	private long balance;

	//6-1getter, setter 
	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner= owner;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	//6-2
	public Account(String owner, long balance) {
		this.owner = owner;
		this.balance = balance;
	}
	//7
	public long deposit(long amount) {
		return this.balance += amount;
	}

	public long withdraw(long amount) {
		return this.balance -= amount;
	}

	public static void main(String[] args) {
		Account account = new Account("홍길동", 100000);
		System.out.println("현재잔액: " + account.deposit(1500000));
		System.out.println("현재잔액: " + account.withdraw(500000));
	}
}



