package 연습만의살길;

import java.util.Random;

public class practice_03 {
public static void main(String[] args) {
	Random random = new Random();
	int[] lotto =new int[6];
	
	for (int i = 0; i < lotto.length; i++) {
		lotto[i] =random.nextInt(45)+1;
		for (int j = 0; j < i; j++) {
			if(lotto[i]==lotto[j]) {
				i--;
			break;
			}
		}
	}
          for (int i = 0; i < lotto.length; i++) {
			System.out.println(lotto[i]);
		}
}
}
