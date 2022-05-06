package chapter03;

import java.util.Random;

//import java.util.Random;

public class ForExample {
public static void main(String[] args) {
//	 int sum = 0;
//	  for (int i = 1; i <=100; i++) {
//	  if (i % 3== 0) {
//       sum +=i;
//	  }
//	  }
//		  System.out.println("3의배수의 총합:" + sum);
	
//	 Random random = new Random(); 
//	  
//	 while(true) {
//		int dice1 = random.nextInt(6)+1;
//		int dice2 = random.nextInt(6)+1;
//	 System.out.println(dice1+dice2);
//	 
//	 if(dice1+dice2 ==5) {
//		 break; 
//	  }
// }
//	 for (int x = 1; x <=10; x++) {
//		for (int y = 1; y <=10; y++) {
//			if((4 * x + 5 * y) == 60) {
//				System.out.println("("+x+","+y+")");
//		}
//	  }	
//	}
	  
	for (int i = 1; i<=4; i++) {
	 for (int j = 1; j<=i; j++) {
		 System.out.print("*");
	 }
				System.out.println();
	 			
	}
	  for (int i = 1; i <=4; i++) {
		for (int j = 4; j >0; j--) {
			if(i<j) {
				System.out.print(" ");
			}else {
				System.out.print("*");
			}
		}
	    System.out.println();
   }
   }
}
