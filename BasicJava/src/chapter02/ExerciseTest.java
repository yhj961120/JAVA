package chapter02;

import java.util.Scanner;

public class ExerciseTest {
public static void main(String[] args) {
	double width;
	double height;
	double area;
	double perimeter;
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("가로의 길이는?(단위: m):");
	width = scanner.nextDouble();
	
	System.out.print("세로의 길이는?(단위:m):");
	height = scanner.nextDouble();
	
	area = width * height;
	perimeter = (width+height) * 2;
	
	System.out.println("직사각형 넓이:" + area);

	System.out.println("직사각형 둘레:" +perimeter);
	
	
	
	
	
	
	
	
}
}
