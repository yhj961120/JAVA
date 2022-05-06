package chapter04;

import java.util.Random;
import java.util.Scanner;

public class 과제5 {
	public static void main(String[] args) {
		Random random = new Random();
		int ranNum = random.nextInt(100) +1 ;
		
		Scanner scanner = new Scanner(System.in);
	int count = 0;
	    while(true) {
	    	count++;
	    	System.out.println("1부터 100사이의 정수 중 하나를 입력하세요.");
	    	int comNum = scanner.nextInt();
	    
	    	if(comNum > ranNum) {
	    		System.out.println("정답은 더 작은 수 입니다.");
	    	
	    	
	    	} else if(comNum<ranNum) {
	    		System.out.println("정답은 더 큰 수 입니다.");
	    			
	    	} else {
	    				System.out.println("정답입니다.");
	    				System.out.println("당신은" + count++ + "번만에 맞췄습니다.");
	    				break;
	    			}
	    }
System.out.println("게임을 종료합니다.");
scanner.close();
	}
	}

