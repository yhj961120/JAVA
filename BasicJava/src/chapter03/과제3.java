package chapter03;

import java.util.Scanner;

public class 과제3 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
     
	System.out.println("점수를 입력하세요.");
     
	System.out.print("프로그래밍 기초 :");
     int a = scanner.nextInt();
    
     System.out.print("데이터베이스 :");
     int b = scanner.nextInt();
     
     System.out.print("화면 구현 :");
     int c =scanner.nextInt();
     
     System.out.print("애플리케이션 구현 :");
     int d = scanner.nextInt();
     
     System.out.print("머신러닝 :");
      int e = scanner.nextInt();
      
      int total = (a+b+c+d+e);
      System.out.println("총점 : " + total);

      double avg = (double)total / 5.0;
      System.out.println("평균 : "+avg);
      
      String grade = "";

      
      
//      if(avg>=90) {
//	     grade = "A";
 //    }else if(80<=avg) {
  //      grade ="B";
 //   }else if (70<=avg) {
 //   	grade ="C";
 //   }else if(60<=avg ) {
 //   	grade ="D";
  //  }else {
 //   	grade ="F";
 //   }
  //    System.out.println("학점 : "+ grade);
      
     switch ((int)avg /10) {
	case 10: case 9:
		grade = "A";	
		break;
	case 8:
		grade="B";
		break;
	case 7:
		grade="C";
		break;
	case 6:
		grade="D";
	default:
		grade="F";
			break;
	}
     System.out.println("학점 : "+ grade);
 }
}
