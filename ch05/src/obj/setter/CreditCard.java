package obj.setter;

public class CreditCard {

	public String owner;
	private long number;
	private int point;
	private int balance;

	//카드 사용 메소드
	public void use (int amount) {
		balance += amount;
	}

	//카드 비용지불 메소드
	public void paybill(int amount) {
		this.balance -= amount;
		addPoint(amount);
	}
	//카드 포인트 추가 메소드
	private void addPoint(int amount) {
		point += amount/1000;

	}
	//getter&setter(캡슐화)
	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		
		if(number < 1000_0000_0000_0000L) {
			System.out.println("잘못된 카드 번호입니다.");
			return;
			
		}
		this.number = number;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}



}