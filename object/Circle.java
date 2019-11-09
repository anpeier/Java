package object;

public class Circle extends GeometricObject{
	
	private double radius;

	public Circle() {
		super();
		radius = 1.0;
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	
	public Circle(double radius,String color, double weigth) {
		super(color,weigth);
		this.radius = radius;
		
	}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	//求圆面积
	public double findArea() {
		return Math.PI * radius *radius;
	}
	
	//比较两个圆半径是否相等
	public boolean equals(Object obj) {
		
		if(this == obj) {
			return true;
		}
		
		if(obj instanceof Circle) {
			Circle c = (Circle)obj;
			return this.radius == c.radius;
		}
		
		return false;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
}
