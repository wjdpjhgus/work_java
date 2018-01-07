package Practice;

public abstract class Fruit {
	//abstract가 무얼 뜻하는지 자세히 알필요가 있음
	public abstract void print();
		
	public static void main(String[] args) {
		Fruit fAry[] = { new Grape(), new Apple(), new Pear()};
		for (Fruit f: fAry)
			f.print();
	}

}
