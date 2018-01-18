package practice;

import java.util.Date;

public class PrimeTime implements Runnable {
//필드 
	private int num;
	private String str;
	
	
	public PrimeTime(int num) {
	super();
	this.num = num;
}

	@Override
	public void run() {
		new Date();
		System.out.println(str);
		
		
	}

}
