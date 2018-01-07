package Practice;

public class Complex {
	//필드
	private double real;
	private double imagin;
	
	//생성자
	Complex(double a, double b){ 
		this.real = a;    
		this.imagin = b;
	}

	public Complex add(Complex c1, Complex c2) {
		double real = c1.real + c2.real;
		double imagin = c1.imagin + c2.imagin;
		return new Complex(real, imagin);
	}


	public Complex add(double r) {
		double real = this.real + r;
		double imagin = this.imagin;
		return new Complex(real, imagin);
	}

	public String toString() { 
		if(imagin > 0) {
			return real + "+" + imagin + "i";
		} else if (imagin < 0) {
			return real + "" + imagin + "i";
		} else {
			return Double.toString(real);
		}
	}


	public static void main(String[] args) {
		Complex c1 = new Complex(8, 8);
		Complex c2 = new Complex(6, 8);
		Complex c3 = new Complex(3, 2);

		System.out.println(c1);
		System.out.println(c2);
		System.out.println(add(c1,c2));
		System.out.println(c1.add(c2).add(c3));
		System.out.println(c1.add(1,2).add(3).add(3, 4));
	}
}


