package chapter03;

import java.util.Random;
import java.util.Scanner;

public class 과제5 {
public static void main(String[] args) {
	Random random = new Random();
	Scanner scanner = new Scanner(System.in);
	
	
	int num = random.nextInt(100) +1 ;
	int count = 0;
    while(true) {
    	
    	System.out.println("1부터 100사이의 정수");
    	int comNum = scanner.nextInt();
    	count++;
    	if(comNum > num) {
    	System.out.println("정답은 더 작은 수 입니다.");
    	} else if(comNum<num) {
    		System.out.println("정답은 더 큰 수 입니다.");
    			} else {
    				System.out.println("정답입니다.");
    			
    				break;
    			}
   
    }
 }
}
