package chapter03;

import java.util.Random;

public class SwitchNoBreakCaseExample {
public static void main(String[] args) {
	Random random = new Random();
    int time = random.nextInt(4) + 8;
    System.out.println("[현재시각:" + time + "시");

    switch(time) {
    case 8:
    	System.out.println("출근합니다.");
    case 9:
   	System.out.println("회의를 합니다.");
    case 10:
    	System.out.println("업무를 봅니다.");
    default:
   	System.out.println("외근을 나갑니다.");
    
   }
 
//char 타입의 switch문
    // 	char grade = 'B';
	
	//switch(grade) {
	// case'A':
	// case'a':
	//	 System.out.println("우수 회원입니다.");
	//     break;
	// case 'b':
	//	 System.out.println("일반회원입니다.");
	//	 break;
	//	 default:
		//	 System.out.println("손님입니다.");
	
	//}

//String position = "과장";

//switch(position) {
//case "부장":
//	System.out.println("700만원");
  //  break;
//case "과장":
	//System.out.println("500만원");
  // break;
  // default:
//	  System.out.println("300만원");


  // }
  }
} 