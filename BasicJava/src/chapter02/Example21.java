package chapter02;

import java.util.Scanner;

public class Example21 {
public static void main(String[] args) {
	double distance = 40e12;
	double Speed = 300_000;
	double LightSpeedPerYear = Speed * 60 * 60 * 24 * 365;
    double time = (distance / LightSpeedPerYear);
    
    System.out.println("빛의 속도로 프록시마 센타우리 별까지 가는데 걸리는 시간은"
                        + time + "광년이다.");

}
}
