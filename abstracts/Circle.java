package abstracts;

public class Circle extends GeometricObject {

	private double radius;
	
	public Circle(String color, double weigth , double radius) {
		super(color, weigth);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double findArea() {
		return Math.PI * radius*radius;
	}
	
}
