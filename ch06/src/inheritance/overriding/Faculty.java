package inheritance.overriding;

public class Faculty extends Person	{	
	public String univ;	//소속대학
	public long number;	//사원번호
	
	public Faculty(String name, long number, String univ,  long idNumber) {
		super(name, number);
		this.univ= univ;
		this.number = idNumber;
		
	}
	
	public long getSnumber() {
		return super.number;	//주민번호
	}
	
	@Override // 오버라이드 된 메소드 확인
	public void printInfo() {
		System.out.print("Faculty이름: "+ super.name + " 주민번호: "+super.number);
		System.out.println(" Faculty대학: "+ this.univ + " 직원번호: " +this.number);
	}

}
