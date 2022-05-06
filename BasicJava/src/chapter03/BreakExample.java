package chapter03;

import java.util.Random;

public class BreakExample {
  public static void main(String[] args) {
//	Random random = new Random();
//	 while (true) {
//		int ranNum = random.nextInt(6)+1;
//	    System.out.println(ranNum);
//	    if(ranNum ==6) {
//	       break;
//	    }
	// }
//	System.out.println("종료");

//	  Outter: for(char upper='A'; upper<='Z'; upper++) {
//		     for(char lower='a'; lower<='z';lower++) {
//		     System.out.println(upper+"_"+lower);
//		     if(lower=='g') {
//		    	 break Outter;
	//	     }
	//	     }
//		     }
	//  System.out.println("실행종료");
	  
//	for (int i = 1; i <=10; i++) {
//		if(i%2 !=0) {
//			continue;
//		}
//	System.out.println(i);
//	}  
        int sum = 0;
	  for (int i = 1; i <=100; i++) {
	  if (i % 3== 0) {
        sum +=i;
	  }
	  }
		  System.out.println("3의배수의 총합:" + sum);
	
	  
	  
	  
	  
	  
	  
	  
	  
	  
}
}
