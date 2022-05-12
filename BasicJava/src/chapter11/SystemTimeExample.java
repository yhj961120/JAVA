package chapter11;

public class SystemTimeExample {
public static void main(String[] args) {
	long time1 = System.currentTimeMillis();
	
	int sum=0;
	for (int i = 1; i <=100000000; i++) {
		sum += i;
	}

	long time2=System.currentTimeMillis();
	
	System.out.println("1~100000000까지의 합:" +sum);
	System.out.println("계산에 "+ (time2-time1) + " 나노초가 소요되었습니다.");
}

}
