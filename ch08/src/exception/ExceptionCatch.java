package exception;

public class ExceptionCatch {

	public static void main(String[] args) {
		int data = 0;
		
		//catch여러개 구성
		try {
			data = Integer.parseInt("1123.45");
		}
		catch (ClassCastException e) {
			System.out.println("예외발생 1:"+ e);
			System.out.println("e.getMassage():"+e.getMessage());
		}
		catch (Exception e) {
			System.out.println("예외발생 2:"+ e);
			System.out.println("e.getMassage():"+e.getMessage());
			System.out.println("e.printStackTrace();");
			e.printStackTrace();
			
		}
		
		System.out.printf("data = %d %n",data);
	}

}
