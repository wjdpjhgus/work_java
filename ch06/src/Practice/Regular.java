package Practice;

public class Regular extends Employee {
	private int Setter= getSalary();
	
	
	public int getSetter() {
		return Setter;
	}


	public void setSetter(int setter) {
		Setter = setter;
	}


	public Regular(String name, int age, String address, String department) {
		super(name, age, address, department);
		
	}
	
	
	public void printInfo() {
		System.out.println("월급: "+this.getSalary());
		System.out.println("이름: "+super.getName()+" 나이: "+super.getAge()+" 주소: "+super.getAddress()+" 부서: "+super.getDepartment());
		
	}
	


}
