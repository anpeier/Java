package com.atguigu.polymorphic;

public class GeometricObject {

	protected String color;
	protected double weigth;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getWeigth() {
		return weigth;
	}
	public void setWeigth(double weigth) {
		this.weigth = weigth;
	}
	public GeometricObject(String color, double weigth) {
		super();
		this.color = color;
		this.weigth = weigth;
	}
	
	public double findArea() {
		return 0.0;
	}
	
	
}
