package chapter02;

import java.util.Scanner;

public class ExerciseTT {
public static void main(String[] args) {
	double radius;
	double height;
	double volume;
	double area;
	double pi = Math.PI;
	
  Scanner scanner = new Scanner(System.in);
  
  System.out.print("원기둥의 밑변의 반지름을 입력하시오.(단위:cm)");
   radius = scanner.nextDouble();
   System.out.print("원기둥의 높이를 입력하시오.(단위:cm)");
   height = scanner.nextDouble();
   
   area = (radius * radius) * pi;
   volume = area * height;
   
   System.out.println("원기둥 밑변의 넓이는 " + area + "㎠이고 " + "원기둥의 부피는" + volume + "㎠이다.");
   
 }
}
