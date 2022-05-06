package chapter05;

import java.util.Random;

public class wwww {
public static void main(String[] args) {
	int[] lottos = new int[45];
	
	for (int i = 0; i <45; i++) {
		lottos[i] =i+1;
	}
  Random random = new Random();
  for (int i = 0; i < lottos.length; i++) {
	int ranNum = random.nextInt(lottos.length);
	int temp = lottos[i];
	lottos[i] =lottos[ranNum];
	lottos[ranNum] = temp;
	
}
for (int i = 0; i < 6; i++) {
	System.out.println(lottos[i]+i+1);
}
}

}
