package inheritance.abstractinterface;

public interface Connectable {
	//상수 정의
	public static final String name = "연결방법: USB"; //네임은 이제 변하지 않음 public static 는 생략가능
	
	
	//추상메소드 선언
	public abstract void connect();				//public static 는 생략가능
}
