package chapter06.Exercise;

public class Circle {
	double Radius;
	double X;
	double Y;
	double Area = Math.PI;

	public Circle() {
		
	}
	public double getRadius() {
		return Radius;
	}

	public void setRadius(double Radius) {
		if (Radius > 0) {
		this.Radius = Radius;
	 }
	}
	public double getX() {
		return X;
	}

	public void setX(double X) {
		this.X = X;

	}

	public double getY() {
		return Y;
	}

	public void setY(double Y) {
		this.Y = Y;
	}

	public double getArea() {
		return Math.PI * (Radius * Radius);
	}
}
