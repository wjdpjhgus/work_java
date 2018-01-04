package inheritance.constructor;
/*
 * 자바는 한개 클래스만 상속 받을 수 있다.
 */
public class Motor extends Vehicle {
	public String name ="자동차"; //이름 덮어씀 원래는 "차량"	
	public int displacement;	//배기량
	
	//Motor의 기본생성자
	public Motor() {
		//부모가 생성이 되야 자식이 생성되기때문에 항상 부모의 생성자를 한번 호출해야한다.
		super(); //vehicle(); 생략가능(컴파일러가 알아서 자동으로 생성하기 때문에)
	}
	
	public Motor(double maxSpeed, int seater, int displacement) {
		super(maxSpeed, seater);
		//this.maxSpeed =maxSpeed;
		//this.seater =seater;
		this.displacement =displacement;
	}
	
	public void printLnfo() {
		System.out.print(super.name+": "+name);	
		System.out.println(", 최대속도: "+maxSpeed+"km");
		System.out.print("정원: "+seater+ "명");
		System.out.println(", 배기량: "+displacement+ "cc");
	}
	
	
	
	public static void main(String[] args) {
		Motor myCar =new Motor(300, 4, 5000); //객체 만듦
		//출력
		myCar.printLnfo(); 
	}
	

}
