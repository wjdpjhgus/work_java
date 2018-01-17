package thread;

class IncThread extends Thread {
	
	//생성자 구현
	public IncThread(String name) {
		setName(name);	//스레드 이름 입력
	}
	public void run() {
		for (int i = 1; i < 5; i++) {
			try {
				sleep(50);	//50 밀리초 동안에 잠깐 쉬어라 (1000밀리초= 1초)
				System.out.print(getName() + " : " + i);
				System.out.println(", 활성화 된 스레드 수: "+ Thread.activeCount());

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

class DecThread extends Thread {
	public void run( ) {
		for(int i = 5; i>1; i--)
			try {
				sleep(50);
				System.out.print(getName() + " : " + i);
				System.out.println(", 활성화된 스레드 수 : " +Thread.activeCount());
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
}

public class ThreadTest {
	public static void main(String[] args) {
		IncThread inc = new IncThread("증가 스레드");
		inc.start(); //먼저실행하는거 아님 실행순서는 cpu마음
		
		DecThread dec = new DecThread();
		dec.start();
	}
}