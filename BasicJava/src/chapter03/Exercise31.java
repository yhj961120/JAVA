package chapter03;

import java.util.Scanner;

public class Exercise31 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
 
	System.out.print("첫 번째 숫자를 입력하세요 :");
    int frist =scanner.nextInt();
    
    System.out.println("두 번째 숫자를 입력하세요 :");
    int second = scanner.nextInt();
    
    
   int big = ((frist+second)+Math.abs(frist-second))/2;
   int small = ((frist+second)-Math.abs(frist-second))/2;
   
   int quotient = big/small;
   int remainder = big%small;
   
   System.out.println("큰수를 작은 수로 나는 몫은" + quotient +"이고"+ "나머지는" + remainder + "이다." );
   scanner.close();
 }
}
