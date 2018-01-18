package practice;



public class NamedSum extends Thread	 {
	private int max;
	

	public NamedSum(String name, int max) {
		setName(name);
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
		NamedSum s5 = new NamedSum("SumThread",5);
		s5.start();
				
	}
	

}
