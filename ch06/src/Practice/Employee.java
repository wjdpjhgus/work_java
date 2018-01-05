package Practice;

public class Employee {
	//필드
	private String name;
	private int age;
	private String address;
	private String department;
	private int salary;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	//생성자
	public Employee(String name, int age, String address, String department) {
		this.name=name;
		this.age =age;
		this.address=address;
		this.department=department;
	}
	
	public void printInfo() {
		System.out.println("이름: "+name+" 나이: "+age+" 주소: "+address+" 부서: "+department);
	}
}
