package check;

public class A {
	private int m =10;

	public int getM() {
		return m;
	}

	public void setM(int m) {
		this.m = m;
	}
}

class B extends A {
	private int n =20;
	public int add() {
		return super.getM()+n;
	}

		
	}
