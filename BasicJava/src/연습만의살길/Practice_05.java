package 연습만의살길;

import java.util.Random;
import java.util.Scanner;

public class Practice_05 {
public static void main(String[] args) {
	Random random = new Random();
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("가위 바위 보 게임");
	
    int ai=random.nextInt(3);
	
	String []com = {"가위","바위","보"};
	
	
	System.out.print("형주 : ");
	String hj =scanner.next();
	
	String result= "";
	
	System.out.println("인공지능 :" + com[ai]);
	
	if(com[ai].equals(hj)) {
		result="비김";
	} else if(com[ai].equals("가위") && hj.equals("보")
			||com[ai].equals("바위") && hj.equals("가위")
			||com[ai].equals("보") && hj.equals("바위")){
				result="인공지능 승리";		
			}else 
				result ="형주 승리";
     
	System.out.println("결과 :" + result);
     
}
}
