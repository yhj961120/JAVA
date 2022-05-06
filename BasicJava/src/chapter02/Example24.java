package chapter02;

import java.util.Scanner;

public class Example24 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("500원짜리 동전의 갯수");
	int  won500 = sc.nextInt();
	
	System.out.println("100원짜리 동전의 갯수");
	int  won100 = sc.nextInt ();
	
	System.out.println("50원짜리 동전의 갯수");
	int  won50 = sc.nextInt ();
	
	System.out.println("10원짜리 동전의 갯수");
	int  won10 = sc.nextInt ();
	
 System.out.println("저금통 안의 동전의 총 액수" +( won500 * 500 + won100*100 + won50*50 + won10*10));
			
   }
}

