package practice;

public class SalaryMan {
	int salary = 1000000;
	
	public int getAnnualGross() {
		  return salary * 12 + salary * 5;
	}
	
	public SalaryMan() {
		
	}
	
	public SalaryMan (int salary) {	
		this.salary=salary;
	}
	
	
	public static void main(String[] args) {
		System.out.println(new SalaryMan().getAnnualGross());
		System.out.println(new SalaryMan(2_000_000).getAnnualGross());
		
		

	}

}
