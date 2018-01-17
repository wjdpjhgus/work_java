package thread;


public class SumThread implements Runnable {


	private int end;
	//더하기 어느숫자까지 할까 설정하는 생성자
	public SumThread(int end) {
		this.end= end;
	}

	@Override
	public void run() {
		int sum = 0;
		for( int i =1; i<=this.end; i++) {
			sum+=i;
			System.out.print("현재 스레드 수: "+Thread.activeCount());
			System.out.print(", "+ Thread.currentThread().getName());//실제 수행되는 스레드 이름을 알고 싶을때 사용
			System.out.printf(": sum(1:%d) = %d %n", i, sum);
		}

	}
	public static void main(String[] args) {
		System.out.print("main 스레드 ID: ");
		System.out.print(Thread.currentThread().getId());
		System.out.print(", 현재 스레드 수: ");
		System.out.print(Thread.activeCount());
		System.out.print(", 현재 스레드 이름: ");
		System.out.println(Thread.currentThread().getName());

		Runnable r1 = new SumThread(5); //인터페이스상속받은 객체를 스레드에 집어 넣어서 객체 만듦
		Thread th1 = new Thread(r1);
		th1.start();
	}

}
