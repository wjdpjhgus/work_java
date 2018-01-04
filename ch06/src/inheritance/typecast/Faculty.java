package inheritance.typecast;

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

}
