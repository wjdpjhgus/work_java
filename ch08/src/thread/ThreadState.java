package thread;

public class ThreadState implements Runnable {

	@Override
	public void run() {
		for ( int i = 1; i<10; i++) {
			try {
				Thread.sleep(40);//40 밀리초 멈춤
				System.out.print("현재 스레드 상태: "+Thread.currentThread().getState()+ ", ");//현재 스레드의 상태를 출력
				System.out.println("현재 스레드: "+Thread.currentThread().getName()+": "+ i );// 현재 스레드의 이름을 출력
			} 
			catch (InterruptedException e) {
				System.out.println("InterruptedException이 발생되어 스레드를 종료합니다.");
				System.out.println("현재 스레드: "+Thread.currentThread().getName()+": "+ i );
				return;
			}
			catch (Exception e) {
				e.printStackTrace();
				System.out.println("현재 스레드: "+Thread.currentThread().getName()+": "+ i );
			}

		}

	}

	public static void main(String[] args) throws InterruptedException {
		System.out.println("스레드의 모든 상태: 6 가지");
		for (Thread.State c : Thread.State.values())//Thread.State eum에 정의된 값들을 하니씩 출력해 본것
			System.out.println(c+" ");
		System.out.println('\n');
		
		Thread th = new Thread(new ThreadState());
		System.out.println("기본 우선순위: "+th.getPriority());
		//우선순위지정
		th.setPriority(Thread.NORM_PRIORITY+2);//1~10R까지 지정 지금은 7= 5+2
		System.out.println("우선순위 변경:"+ th.getPriority());
		
		System.out.println("1단계: "+ th.getState());
		th.start();//-스레드에서 실행
		
		System.out.println("2단계: "+ th.getState());
		Thread.sleep(130);//main 스레드에서 실행->main스레드가 130밀리 초 멈춤
		
		//먼저시작해도 끝나는게 먼저 끝나지는 않는다.
		th.interrupt(); //main에서 실행
		
		System.out.println("3단계: "+ th.getState()); //th는 메인에 객체고 getState는 Thread클래스에에 있다. -main에서 실행
		Thread.sleep(1000);
		
		System.out.println("4단계: "+ th.getState()+"현재 스레드: "+th.currentThread().getState());

	}
}
