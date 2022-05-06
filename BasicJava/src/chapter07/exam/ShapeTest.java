package chapter07.exam;

public class ShapeTest {
public static void main(String[] args) {
	Shape[] shapse =new Shape[3];
	shapse[0] = new Circle(1.0);
	shapse[1] = new Triangle(2.0);
	shapse[2] = new Rectangle(2.0,3.0);
    for (Shape shape : shapse) {
		System.out.println(shape);
	}
}
}
