package chapter09;

public class Circle extends Shape {

	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public double area() {
		return (Math.PI * radius * radius);
	}

	public double perimeter() {
		return (2 * Math.PI * radius);
	}

	@Override
	public String toString() {
		return "도형의 종류: 원, 둘레=" + perimeter() + ", 넓이=" + area() + "]";
	}
}
