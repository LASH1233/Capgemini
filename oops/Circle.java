package oops;

public class Circle {
	private double radius;
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius=radius;
	}
	public Circle Area(double radius) {
		setRadius(getRadius() * getRadius() * Math.PI);
		return this;
	}
	public Circle Perimeter(double radius) {
		setRadius(2*Math.PI*getRadius());
		return this;
	}
	public Circle Diameter(double radius) {
		setRadius(2*getRadius());
		return this;
	}
	
}
