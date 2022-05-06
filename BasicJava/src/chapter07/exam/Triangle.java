package chapter07.exam;

public class Triangle extends Shape {
	private double side;

	public Triangle(double side) {
		this.side = side;
	}

	@Override

	public double area() {
		return (Math.sqrt(3) * side * side / 4);
	}

	public double perimeter() {
		return (side * 3);
	}

	@Override
	public String toString() {
		return "Triangle [둘레=" + perimeter() + ", 넓이=" + area() + "]";
	}

}
