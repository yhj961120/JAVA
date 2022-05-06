package chapter02;

import java.util.Scanner;

import org.omg.CosNaming._NamingContextExtStub;

public class Example23 {
public static void main(String[] args) {
	// 입력부분
   Scanner sc = new Scanner(System.in);
      
   System.out.print("원기둥 밑변의 반지름을 입력하시오. (단위:cm)"); 
   double radius = sc.nextDouble();
    		
	System.out.print("원기둥의 높이를 입력하시오. (단위:cm)");
	double height = sc.nextDouble();
//처리 부분
	double area = radius * radius *Math.PI;
    double volume = area * height;
	
    System.out.print("원기둥 밑변의 넓이는" + area + "cm이고," + "원기둥의 부피는" + volume + "이다.");
    
 
}
}
