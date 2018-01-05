package inheritance.abstractinterface;
//추상클래스
public abstract class Shape {
	
	protected double x, y;
	
	public Shape(double x, double y) {
		this.x = x;
		this.y = y;
		
	}
	
	//일반메소드
	public void drawCenter() {
		System.out.println("(x,y) =" +x+", "+y);
		
	}
	//추상 메소드
	/*
	 * 헤드만 있고 바디가 없음
	 * -상속받은 클래스에서 구현을 하라는 뜻
	 */
	public abstract void draw();
	
	public static void main(String[] args) {
		s.draw();
		//Shape s = new Shape(3.1, 4.5);		
		//객체화 오류-추상 메소드 때문에/ 객체를 만들려면 모든 메소드가 구현이 되어있어야하는데
		//draw에 기능이 구현이 안되어 있음
	}

}
