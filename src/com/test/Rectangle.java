package com.test;

public class Rectangle implements Shape {

	double rHeight;
	
	double rWidth;
	
	public Rectangle(double rHeight, double rWidth) {
		super();
		this.rHeight = rHeight;
		this.rWidth = rWidth;
	}

	public double getrHeight() {
		return rHeight;
	}
	
	public void setrHeight(double rHeight) {
		this.rHeight = rHeight;
	}

	public double getrWidth() {
		return rWidth;
	}

	public void setrWidth(double rWidth) {
		this.rWidth = rWidth;
	}

	@Override
	public double getArea() {
		
		double areaOfRectangle=rHeight * rWidth;
		return areaOfRectangle;
	}

}
