package Practice;

public class Temporary extends Employee {

	//필드
	private int workhours;
	private int hsalary=10000;
	
	

	public int getWorkhours() {
		return workhours;
	}

	public void setWorkhours(int workhours) {
		this.workhours = workhours;
		this.Setter =workhours*hsalary;
		
	}
	
	int Setter=workhours*hsalary;
	//생성자
	public Temporary(String name, int age, String address, String department) {
		super(name, age, address, department);
		
	}
	
	public void printInfo() {
		System.out.println("월급: "+this.Setter);
		System.out.println("이름: "+super.getName()+" 나이: "+super.getAge()+" 주소: "+super.getAddress()+" 부서: "+super.getDepartment());
		System.out.println("비정규직, "+" 일한시간: "+getWorkhours()+"급여:"+Setter);
	}
	
	public static void main(String[] args) {
		Employee r = new Regular("이순신", 35, "서울", "인사부");
		Employee t = new Temporary("장보고", 25, "인천", "경리부");
		r.setSalary(5000000);
		r.printInfo();
		((Temporary) t).setWorkhours(120);
		t.printInfo();
		
		
	}
}
