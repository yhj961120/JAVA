package chapter07.exam;

public class Rectangle extends Shape {
	private double width;
	private double height;

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public double area() {
		return (width * height);
	}

	public double perimeter() {
		return ((width + height) * 2);
	}

	@Override
	public String toString() {
		return "Rectangle [둘레=" + perimeter() + ", 넓이=" + area() + "]";
	}

}

