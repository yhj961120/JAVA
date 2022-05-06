package chapter03;

import java.util.Random;

public class RandomExample {
public static void main(String[] args) {
	//옛날 랜덤 공식  마지막숫자-처음숫자+1
	//(int)(Math.random( )*(추출할 숫자)) + 처음 숫자;
	
    //앞으로 사용
	Random random = new Random();
    random.nextInt(6); //0부터 5까지(6) + 처음숫자;
   System.out.println(random.nextInt(6));
   System.out.println(random.nextInt(6));
   System.out.println(random.nextInt(6));
   System.out.println(random.nextInt(6));
   System.out.println(random.nextInt(6));
   System.out.println(random.nextInt(6));
   System.out.println(random.nextInt(6));
   System.out.println(random.nextInt(6));
   System.out.println(random.nextInt(6));
   System.out.println(random.nextInt(6));
    
    

}
}
