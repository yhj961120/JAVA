package chapter02;

public class Exercisettest {
public static void main(String[] args) {
	 double Distance = 40e12;
	 double LightSpeed = 3e5;
	 double LightSpeedPerYear = LightSpeed * 60 * 60 * 24 * 365;
	 double Time = (Distance/LightSpeedPerYear);
	 
	 System.out.println("빛의 속도로 프로시마 센타우리 별까지 가는데 걸리는 시간은" + Time + "광년이다.");
}
}
