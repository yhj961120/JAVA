package chapter03;

import java.util.Scanner;

public class 연습문제_과제 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
   
	System.out.print("삼각형의 첫번째 변의 길이를 입력하세요.");
     int first = scanner.nextInt();
      
     System.out.print("삼각형의 두번째 변의 길이를 입력하세요.");
      int second = scanner.nextInt();
      
      System.out.print("삼각형의 세번째 변의 길이를 입력하세요.");
      int third = scanner.nextInt();
      
      
      if(first<second+third && first+second>third && first+third>second) {
       System.out.println("삼각형을 만들수 있습니다.");        
      } else {
          System.out.println("삼각형을 만들 수 없습니다.");
      }
    scanner.close();
}
}