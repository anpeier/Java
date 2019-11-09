package com.atguigu.polymorphic;

public class MyRectangle extends GeometricObject {

	private double width;
	private double heigth;
	
	public MyRectangle(String color, double weigth, double width, double heigth) {
		super(color, weigth);
		this.width = width;
		this.heigth = heigth;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeigth() {
		return heigth;
	}

	public void setHeigth(double heigth) {
		this.heigth = heigth;
	}
	
	@Override
	public double findArea() {
		return width * heigth;
	}

}
