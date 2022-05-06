package chapter03;

import java.util.Scanner;

public class tttttttt {
public static void main(String[] args) {
	//int pencils = 534;
	//int students = 30;
	
	//int PencilsPerStudent = (pencils/students);
	//System.out.println(PencilsPerStudent);


   // int PencilsLeft = (pencils%students);
   // System.out.println(PencilsLeft);


   // int value = 356;
   // System.out.println(356-(356%300));

  //  int lengthTop = 5;
  //  int lengthBottom = 10;
  //  int height = 7;
  //  double area = ((lengthTop+lengthBottom)* height /2);
  //  System.out.println(area);
    
    Scanner scanner = new Scanner(System.in);
  System.out.print("첫 번째 수:");
   double first = scanner.nextDouble();
   System.out.print("두 번째 수:");
   double second = scanner.nextDouble();
   
   double result = first%second;
   
  System.out.println("-------------");
   
   if(second != 0.0){
   System.out.println("결과:" + (first/second));
  }     else 
   {
   System.out.println("결과: 무한대");}	 
 
 //  int var1 = 10;
 //  int var2 = 3;
 //  int var3 = 14;
  // double var4 =var1 * var1 *  Double.parseDouble(var2 + "." + var3);
  // System.out.println("원의 넓이:" + var4);
  
  // Scanner scanner2 = new Scanner(System.in);
   
  // System.out.print("아이디");
  // String name = scanner.nextLine();
   
  // System.out.print("패스워드");
  // //String strPassword = scanner.nextLine();
   //int password = Integer.parseInt(strPassword);
   
   //if (name.equals("java") ) {
	//if (password==12345  ) {
     //System.out.println("로그인 성공");
//	} else {
 //  System.out.println("로그인 실패:패스워드가 틀림");
//	}
//	} else {	
	
  // System.out.println("로그인 실패:아이디 존재하지 않음");
//	}		
   
  // int x = 10;
  // int y = 5;
  // System.out.println((x>7)&&(y<=5));   
   //System.out.println((x%3==2)||(y%2 !=1));   
		
 // int score = 85;
 // String result = (!(score>90)) ? "가" : "나";
 // System.out.println(result);

		

	
   }
 }


