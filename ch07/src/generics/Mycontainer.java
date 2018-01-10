package generics;

import java.util.ArrayList;

public class Mycontainer<E> { 
	private ArrayList<E>list;
	
	public Mycontainer() {
		list = new ArrayList<E>();
		
	}
	
	public E get(int index) {
		return list.get(index);
	}
	
	public void add(E element) {
		list.add(element);
	}
	
	public static void main(String[] args) {
		Mycontainer<String> p1 = new Mycontainer<String>();//앞에E는 String으로 바뀜
		p1.add("algo1");
		p1.add("C");
		//p1.add(5);		//오류발생
		p1.add("java");
		System.out.println(p1.get(0)+" ");
		System.out.println(p1.get(1)+" ");
		System.out.println(p1.get(2)+" ");
		
		Mycontainer<Integer> p2 = new Mycontainer<Integer>();//앞에E는 String으로 바뀜
		p2.add(10);
		p2.add(20);
		//p1.add(5);		//오류발생
		p2.add(30);
		System.out.println(p2.get(0)+" ");
		System.out.println(p2.get(1)+" ");
		System.out.println(p2.get(2)+" ");
	}
}
