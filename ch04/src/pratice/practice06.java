package pratice;

public class practice06 {

	public static void main(String[] args) {
		double C;
		double F;
	
		
		for(C=-60; C <=140; C +=20) {
			F=(9.0/5.0)*C+32;
			System.out.println("섭씨" + C + "도는 화씨로" + F +"도 이다");
		}

	}
}
