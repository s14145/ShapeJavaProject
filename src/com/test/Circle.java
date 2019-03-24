package com.test;

public class Circle implements Shape {
	
	double cRadius;
	

	public Circle(double cRadius) {
		super();
		this.cRadius = cRadius;
	}

	
	public double getcRadius() {
		return cRadius;
	}

	public void setcRadius(double cRadius) {
		this.cRadius = cRadius;
	}

	@Override
	public double getArea() {
		double areaOfCircle= (double)Math.PI * cRadius * cRadius;
		return areaOfCircle;
	}

}
