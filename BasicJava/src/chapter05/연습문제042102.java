package chapter05;

import java.util.Scanner;

public class 연습문제042102 {
public static void main(String[] args) {
	boolean run = true;
	int studentNum = 0;
	int[] scores = null;
	Scanner scanner = new Scanner(System.in);
	
	while(run) {
		System.out.println("----------------------------------------------------------");
		System.out.println("1.학생수 | 2. 점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
	System.out.println("-----------------------------------------------------------------");
	System.out.print("선택> ");
	
    int selectNo = Integer.parseInt(scanner.nextLine()); //int selectNo =scanner.nextInt();
    
    if(selectNo==1) {
    	System.out.print("학생수>");
    	studentNum=Integer.parseInt(scanner.nextLine());  //int studentNum =scanner.nextInt();
    	scores =new int[studentNum];
    	} else if(selectNo==2) {
    	for (int i = 0; i < scores.length; i++) {
			System.out.print("scores["+i+"]>");  //system.out.printf("scores[d%]> /n",i);
			scores[i] = Integer.parseInt(scanner.nextLine()); //scores[i] =scanner.nextInt();
		}
    }else if(selectNo==3) {
    	for (int i = 0; i < scores.length; i++) {  //scores 랑 studentNum 같다.
			System.out.println("scores["+i+"]>" + scores[i]); //system.out.printf("scores[d%]> %d/n",i);
		} 
    }else if(selectNo==4) {
    	int sum=0;
    	double avg =0;
    	int max = 0;
    	for (int i = 0; i < scores.length; i++) {
		 if (max<scores[i]) {
		   max=scores[i];
		 } 
		   sum +=scores[i];
	}
		avg = (double)sum/studentNum;
		System.out.println("최고점수 :" + max);
		System.out.println("평균점수 :" + avg);
		
    
    }else if(selectNo ==5) {
    	
    	
    	run =false;
    	
    }
	}
 System.out.println("프로그램 종료");
}
}
