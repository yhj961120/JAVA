package chapter03;

import java.util.Scanner;

public class 과제2 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
    
	System.out.print("월을 입력하세요 : ");
     
	int month = scanner.nextInt();
     //Strinh result;
     switch (month) {
     case 1:
         System.out.println(month +"월은 winter입니다. "); //result = "겨울";
         break;
     case 2:
         System.out.println("2월은 winter입니다. ");
         break;
     case 3:
         System.out.println("3월은 spring입니다. ");
         break;
     case 4:
         System.out.println("4월은 spring입니다. ");
         break;
     case 5:
         System.out.println("5월은 spring입니다. ");
         break;
     case 6:
         System.out.println("6월은 summer입니다. ");
         break;
     case 7:
         System.out.println("7월은 summer입니다. ");
         break;
     case 8:
         System.out.println("8월은 summer입니다. ");
         break;
     case 9:
         System.out.println("9월은 fall입니다. ");
         break;
     case 10:
         System.out.println("10월은 fall입니다. ");
         break;
     case 11:
         System.out.println("11월은 fall입니다. ");
         break;
     case 12:
         System.out.println("12월은 winter입니다. ");
         break;
       default:
    	   System.out.println("잘못된 입력입니다.");
     //  System.out.printf("%d월은 %s입니다.", month, result);
     }
   scanner.close();
}
}

//
