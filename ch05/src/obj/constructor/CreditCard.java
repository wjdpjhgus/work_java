package obj.constructor;

public class CreditCard {
	public String owner; //카드소유자
	private long number; //16자리 카드번호
	
	//생성자구현
	//생성자 오버로딩(Constructor Overloading)
	public CreditCard(String owner) {
		this.owner =owner;
	}
	public CreditCard(long number) {
		this.number =number;
	}
	
	public CreditCard(String owner, long number) {
		this.owner =owner;
		this.number =number;
	}
	
	//getter
	public long getNumber() {
		return number;
	}
	
	public static void main(String[] args) {
		CreditCard card1 = new CreditCard("권해동");
		CreditCard card2 = new  CreditCard(3452_4587_2345_9845L);
		card2.owner="권순미";
		CreditCard card3 = new CreditCard("권다해", 5638_8627_8623_8249L);
		
		System.out.println("card1: "+card1.owner+ " "+ card1.getNumber());
		System.out.println("card2: "+card2.owner+ " "+ card2.getNumber());
		System.out.println("card3: "+card3.owner+ " "+ card3.getNumber());
	}

}
