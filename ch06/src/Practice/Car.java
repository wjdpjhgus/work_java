package Practice;

public class Car {
	//필드
	public int maxSpeed;//최대속도
	public int speed; 	//현재속도

	//생성자
	public Car(int maxSpeed) {
		this.maxSpeed =maxSpeed;
	}
//speedUp메소드
	public void speedUp() {
		this.speed += 5;
		System.out.println("speedUp() 호출: 최대속도: "+this.maxSpeed+", 현재속도: "+this.speed );
	}
	public void speedUp(int v) {
		if (v>0 && this.speed + v <= this.maxSpeed) {
			this.speed += v;
			System.out.println("speedUp("+v+") 호출: 최대속도: "+this.maxSpeed+", 현재속도: "+this.speed );
			if (this.speed > this.maxSpeed) {
				this.speed=this.maxSpeed;
				System.out.println("speedUp("+v+") 호출: 최대속도보다 높아 최대속도로 지정, 최대속도: "+this.maxSpeed+", 현재속도: "+this.maxSpeed );

			}
		}
		else {
			if(this.speed + v > this.maxSpeed) {
				this.speed=this.maxSpeed;
			System.out.println("speedUp("+v+") 호출: 최대속도보다 높아 최대속도로 지정, 최대속도: "+this.maxSpeed+", 현재속도: "+this.maxSpeed );
			}
			else {
			System.out.println("speedUp("+v+") 호출: 오류: 속도가 음수이므로 0으로 지정: 최대속도: "+this.maxSpeed+", 현재속도: "+this.speed );
		}
		}

	}
	
	//speedDown메소드
	public void speedDown() {
		this.speed -= 5;
		System.out.println("speedDown() 호출: 최대속도: "+this.maxSpeed+", 현재속도: "+this.speed );
	}
	public void speedDown(int v) {
		if (v>0 && this.speed>0) {
			this.speed -= v;
			System.out.println("speedDown("+v+") 호출: 최대속도: "+this.maxSpeed+", 현재속도: "+this.speed );
			if  (this.speed < 0) {
				this.speed=0;
				System.out.println("speedDown("+v+") 호출: 속도가 0보다 작아져 0으로 지정, 최대속도: "+this.maxSpeed+", 현재속도: "+this.speed );

			}
		}
		
		else {
			System.out.println("speedDown("+v+") 호출:오류: 속도가 음수이므로 0으로 지정: 최대속도: "+this.maxSpeed+", 현재속도: "+this.speed );
		}
	}

	public static void main(String[] args) {
		Car mycar = new Car(300);
		mycar.speedUp();
		mycar.speedUp();
		mycar.speedUp(-50);
		mycar.speedUp(50);
		mycar.speedDown(-30);
		mycar.speedDown(30);
		mycar.speedDown(30);
		mycar.speedDown(30);
		mycar.speedUp(100);
		mycar.speedUp(300);
	}
}
