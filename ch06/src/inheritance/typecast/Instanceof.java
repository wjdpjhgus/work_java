package inheritance.typecast;

public class Instanceof {

	public static void main(String[] args) {
		Person she = new Person("이소라", 2056432); 
		if(she instanceof Staff) { 				//Staff객체냐고 물어보는 것 false
			Staff st1 =(Staff) she;
		}
		else {
			System.out.println("she는Staff객체가 아닙니다");
			

		}
			Person p = new Staff("김상기",1187543, "강서대학교", 3456);
		if( p instanceof Staff) { 				//본질은 Staff이므로 true
			System.out.println("p는 Staff객체입니다");
			Staff st2 = (Staff) p;				//다운 캐스팅할때 인스턴스 오브 꼭 사용할것
		}
	}

}
