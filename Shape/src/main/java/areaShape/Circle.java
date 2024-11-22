package areaShape;

public class Circle {

	private double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	
	public double getArea()
	{
		return Math.PI *radius*radius;
	}
}
