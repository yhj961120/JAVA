package chapter05;


import java.util.Random;
import java.util.Scanner;


public class Example53 {
public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 Random random = new Random();
 
  System.out.println("가위 바위 보 게임");
 int ai = random.nextInt(3);
 String result=""; 
 String[]com= {"가위","바위","보"};
 
 
 System.out.print("게이머 :");
 String gamer =scanner.nextLine();
 

 System.out.println("인공지능 컴퓨터:" + com[ai]);
 
 if(com[ai].equals(gamer)) {
	 result="비김";
 } else if(com[ai].equals("바위") && gamer.equals("보")
          ||com[ai].equals("가위") && gamer.equals("바위")
          ||com[ai].equals("보") && gamer.equals("가위")){
  result ="게이머 승리";
} else {
	result = "인공지능 승리";

}
 System.out.println("결과 : " + result);
}
}
	 
 