package practice;

public class SalaryMan {
	public int salary=1000000;
	
	public SalaryMan () {	
	}
	
	public int getAnnualGross() {
		  return this.salary += salary * 5;
	}
	
	
	
	public static void main(String[] args) {
		System.out.println(new SalaryMan().getAnnualGross());
		System.out.println(new SalaryMan(2_000_000).getAnnualGross());
		
		

	}

}
