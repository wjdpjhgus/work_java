package obj.basic;

public class Const {

	public static void main(String[] args) {
		final int maxSize = 5;//final사용시 선언과 초기화를 동시에 해야한다.
		
		//maxSize = 8;오류발생
		int data[] = new int[maxSize];
		System.out.println("배열크기: "+ data.length);
		System.out.println("배열크기: "+maxSize);

	}

}
