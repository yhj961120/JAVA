package chapter02; 

import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
		String name = "김자바";
		int age = 25;
		String tel1="010", tel2="123",tel3="4567";
		System.out.println("이름은:" + name);
		System.out.print("나이는:" + age);
	   System.out.println();
		System.out.printf("전화: %s-%s-%s","010", "123", "4578");
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫번째 수:");
		String strNum1 = scanner.nextLine(); 
	   System.out.print("두번째 수:");
	    String strNum2 =  scanner.nextLine();
	    
	    int num1 = Integer.parseInt(strNum1);
	  int num2 = Integer.parseInt(strNum2);
	  int result = num1 + num2;
	    System.out.println("덧셈결과:" + result);
	
	  Scanner sc = new Scanner(System.in);
	   
	  System.out.println("[필수 정보 입력]");
	  
	   System.out.print("1.이름:");
	   String name1 = sc.nextLine();
	   
	   System.out.print("2. 주민번호 앞 6자리:");
	   String ssn = sc.nextLine();
       
	   System.out.print("3.전화번호:");
       String tel = sc.nextLine();

	System.out.println("1.이름:" + name1);
	System.out.println("2.주민번호 앞 6자리:" + ssn);
	System.out.println("3.전화번호:" + tel);
	
	
	}
}