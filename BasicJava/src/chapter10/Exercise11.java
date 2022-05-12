package chapter10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
			try {
			System.out.print("어떤수로 나누시겠습니까?? ");
			int a = scanner.nextInt();
			System.out.print("어떤수로 나누시겠습니까?? ");
			int b = scanner.nextInt();

				int result = a/ b;
				System.out.println(a + " / " + b + " = " + result);
				break;
				
			} catch (InputMismatchException e) {
				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
				scanner.next();
			} catch (ArithmeticException e) {
				System.out.println("0으로 나눌수 없습니다. 다시 입력해주세요.");
			
				}
			
			}
		scanner.close();
	}
	}
