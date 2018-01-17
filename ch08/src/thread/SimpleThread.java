package thread;


class MyThread extends Thread {
	
	// 스레드 기능을 구현하기 위한 메소드 재정의
	@Override
	public void run() {
		//기능구현
		for(int i= 1; i <10; i++)
			System.out.println(getName() +":"+ i +" /실제 스레드: "+ Thread.currentThread().getName());
		
	}
}
public class SimpleThread {
	public static void main(String[] args) {
		MyThread th = new MyThread();// 스레드 생성
		th.start();//스레드 시작 메소드 호출 start내부에서 run실행 Thread-0  동시에 실행하고 싶으면 스레드를 생성하고 실행해야함
		//th.run();main에서 실행 그래서 하나끝나고 다른거 시작
		MyThread th2 = new MyThread(); //Thread-1
		th2.start();
		//th2.run();동작하는 스레드가 main이다
		
	}

}
