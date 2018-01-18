package practice;

public class Sum extends Thread	 {
	private int max;

	public Sum(int max) {
		super();
		this.max = max;
	}
	
	public void run() {
		int total =0;
		for (int i =1; i<=max; i++) {
			total+=i;
					System.out.print(getName()+ ": ");
			System.out.printf("sum(1:%d) = %d %n", i, total);
		}
	}
	
	public static void main(String[] args) {
		Sum s5 = new Sum(5);
		s5.start();
				
	}
	

}
