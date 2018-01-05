package inheritance.abstractinterface;

public class Circle extends Shape	 {
	double radius;

	public Circle(double x, double y, double radius) {
		super(x, y);
		this.radius = radius;
	}
	@Override
	public void draw() {
		super.drawCenter();
		System.out.printf("반지름: %f", this.radius );
		System.out.printf(" 원면적: %f\n",this.radius*this.radius*Math.PI);
	}



}

