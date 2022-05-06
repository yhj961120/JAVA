package chapter02;

import java.util.Scanner;

public class Exercise21 {
public static void main(String[] args) {
	        
	
			Scanner sc = new Scanner(System.in);
	
	System.out.print("가로의 길이는?(단위:㎡):");   //입력부분 (input)
	double width = sc.nextDouble();  //데이터 처리부분
	
	System.out.print("세로의 길이는?(단위:㎡):");
	double height = sc.nextDouble();
		
	double area = width * height;
	double perimeter = (width +  height) * 2;

	System.out.println("직사각형 넓이: " + area);  //데이터 출력부분(output)
	System.out.println("직사각형 둘레길이: " + perimeter);
	
	
    }
}
