package entities;

public class Rectangle1 implements Shape {

	private double width;
	private double height;

	public Rectangle1(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double area() {
		return width * height;
	}

}
