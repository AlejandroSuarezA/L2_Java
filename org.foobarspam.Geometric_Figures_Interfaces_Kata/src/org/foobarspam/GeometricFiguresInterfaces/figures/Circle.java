package org.foobarspam.GeometricFiguresInterfaces.figures;

public class Circle extends Geometric_Shape {
	// Attrs
	private double radius = 0d;
	final double PI = 3.14;

	// Constructors
	public Circle() {
		super();
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public Circle(String name, double radius) {
		super(name);
		this.radius = radius;

	}

	// Set & Get
	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return this.radius;
	}

	// Override area method from superClass
	public double area() {
		return PI * Math.pow(getRadius(), 2);
	}

}
