package inheritance.typecast;

public class Fruit {

	public static void main(String[] args) {
		Fruit f = new Fruit();
		System.out.println(f instanceof Fruit);//true
		System.out.println(f instanceof Apple);
		System.out.println(f instanceof Grape);
		Fruit fa = new Apple(); 
		System.out.println(fa instanceof Fruit);//true-상속받은 부모니깐
		System.out.println(fa instanceof Apple);//true
		System.out.println(fa instanceof Grape);
		Apple a = new Apple();
		System.out.println(a instanceof Fruit);//true-상속받은 부모니깐
		System.out.println(a instanceof Apple);//true
		//System.out.println(a instanceof Grape);//컴파일 오류 상속관계가 아니기 때문에
	}

}
class Apple extends Fruit {
	
}
class pear extends Fruit {
	
}
class Grape extends Fruit {
	
}
