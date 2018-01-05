package inheritance.overriding;

public class Staff extends Faculty {
	public String division;

	public Staff(String name, long number, String univ, long idNumber, String division) {
		super(name, number,univ,idNumber);
		this.division = division;
		
	}
	public void printInfo() {
		System.out.print("Staff이름: "+ super.name + " 주민번호: "+super.getSnumber());
		System.out.print(" Staff대학: "+ super.univ + " 직원번호: " + super.number);
		System.out.println(" Staff부서: "+this.division);
	}

	public void printFacultyInfo() {
		super.printInfo();
	}

	public static void main(String[] args) {
		Person she = new Person("이소라", 2056432);
		she.printInfo();

		Faculty i = new Faculty("김영태", 1145782, "강서대학교", 38764);
		i.printInfo();
		
		Staff he = new Staff("최영기", 1167429, "남도대학교", 1287, "기획처");
		he.printInfo(); //최상위 펄슨으로 간다음 프린트인포 메소드 확인 그다음 Faculty에서 인포 확인 //스테프 프린트 인포 
		
	}
}
